package com.earthchem.dao;


import java.util.ArrayList;
import java.util.List;

import com.earthchem.model.Citation;
import com.earthchem.model.EarthChemData;
import com.earthchem.util.DataUtil;
/**
* Retrieve data from database for EarthChemData tag and its child tags in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-06 
*/
public class EarthChemDataDao {
	
	public EarthChemData getEarthChemData(int sampleNum) {
		EarthChemData ec = new EarthChemData();
		String query ="select distinct ci.citation_num "+
		" from sampling_feature s "+
		" inner join feature_action fa on s.sampling_feature_num = fa.sampling_feature_num "+
		" inner join action ac on fa.action_num = ac.action_num "+
		" inner join dataset ds  on ac.dataset_num = ds.dataset_num "+
		" inner join citation_dataset cd on cd.dataset_num =ds.dataset_num "+
		" inner join citation ci on ci.citation_num = cd.citation_num "+
		" where s.sampling_feature_code in ( select sampling_feature_code from sampling_feature "+
		" where sampling_feature_type_num <> 3 and sampling_feature_num = "+sampleNum+")";
		
		List<Citation> citationList = new ArrayList<Citation>();
		List<Object[]> list = DataUtil.getRecords(query);
		CitationDao dao = new CitationDao();
		int i = 0;
		for(Object[] arr: list) {
			String citationNum = ""+arr[0];
			citationList.add(dao.getCitation(sampleNum, citationNum));
		}
		ec.setCitations(citationList);
		return ec;
	}
}
