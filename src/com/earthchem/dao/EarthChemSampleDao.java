package com.earthchem.dao;


import java.util.List;

import com.earthchem.model.Coord;
import com.earthchem.model.EarthChemSample;
import com.earthchem.model.Geography;
import com.earthchem.model.Location;
import com.earthchem.model.Phase;
import com.earthchem.model.Point;
import com.earthchem.model.Rock;
import com.earthchem.util.DataUtil;
/**
* Retrieve data from database for EarthChemSample tag and its child tags in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-09 
*/
public class EarthChemSampleDao {
	
	public EarthChemSample getEarthChemSample(int sampleNum) {
		EarthChemSample ecs = new EarthChemSample();
		String query="select distinct s.sampling_feature_code sample_id, ei.sampling_feature_external_id igsn, fic.feature_of_interest_cv_name location_name, a.action_description cruise_id "+
		" from sampling_feature s "+
		" join specimen sp on sp.sampling_feature_num = s.sampling_feature_num and sp.material_num = 7 "+
		" left join sampling_feature_external_identifier  ei on ei.sample_feature_num = s.sampling_feature_num "+
		" left join external_identifier_system eis on  eis.external_identifier_system_num = ei.external_identifier_system_num and eis.external_identifier_system_name = 'IGSN' "+
		" join related_feature rf on s.sampling_feature_num = rf.sampling_feature_num "+
		" join feature_of_interest fi on fi.sampling_feature_num = rf.related_sampling_feature_num "+
		" left join feature_of_interest_cv fic on fic.feature_of_interest_cv_num = fi.feature_of_interest_cv_num "+
		" left join feature_of_interest_type fit on fit.feature_of_interest_type_num = fi.feature_of_interest_type_num and fit.feature_of_interest_type_description like 'geolocation_type%' "+
		" join feature_action fa on fa.sampling_feature_num = rf.related_sampling_feature_num "+
		" join action a on a.action_num = fa.action_num "+
		" join action_type at on at.action_type_num = a.action_type_num and at.action_type_name in ('Cruise','Expedition') "+
		" where fic.feature_of_interest_cv_num <> 1 and s.sampling_feature_num ="+sampleNum;
		List<Object[]> list = DataUtil.getRecords(query);
		for(Object[] arr: list) {
			ecs.setSampleNumber(""+sampleNum);
			ecs.setSampleId((String)arr[0]);
			if(arr[1] != null ) ecs.setIgsn((String)arr[1]);
			if(arr[2] != null ) {
				ecs.setGenericDescriptor((String)arr[0]+"; "+(String)arr[2]);
			} else {
				ecs.setGenericDescriptor((String)arr[0]);
			}
			if(arr[3] != null ) ecs.setCruiseid((String)arr[3]);
			ecs.setGeography(new GeographyDao().getGeography(sampleNum));
			ecs.setEarthChemData(new EarthChemDataDao().getEarthChemData(sampleNum));
			break;
		}
		return ecs;
	}
	
}
