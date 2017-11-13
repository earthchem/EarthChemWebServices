package com.earthchem.dao;


import java.util.List;
import com.earthchem.model.Phase;
import com.earthchem.model.Rock;
import com.earthchem.util.DataUtil;
/**
* Retrieve data from database for Rock tag in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
public class PhaseDao {
	
	public Phase getPhase(int sampleNum, String citationNum) {
		Phase phase = new Phase(getRock(sampleNum, ""+citationNum));
		return phase;
		
	}
	
	
	public Rock getRock(int sampleNum, String citationNum) {
		Rock rock = null;
		String query=" select distinct tcp.taxonomic_classifier_name rockclass, lower(tcc.taxonomic_classifier_name) rockname "+
				" from sampling_feature s "+
				" join specimen sp on sp.sampling_feature_num = s.sampling_feature_num "+
				" left join (sampling_feature_taxonomic_classifier stcc "+
				" left join taxonomic_classifier tcc on  stcc.taxonomic_classifier_num = tcc.taxonomic_classifier_num "+
				" left join taxonomic_classifier tcp on tcc.parent_taxonomic_classifier_num = tcp.taxonomic_classifier_num and tcc.taxonomic_classifier_type_cv = 'Rock Class' ) "+ 
				" on sp.sampling_feature_num = stcc.sampling_feature_num "+
				" join feature_action fa on s.sampling_feature_num = fa.sampling_feature_num "+
				" join action ac on fa.action_num = ac.action_num "+
				" join dataset ds  on ac.dataset_num = ds.dataset_num "+
				" join citation_dataset cd on cd.dataset_num =ds.dataset_num "+
				" where s.sampling_feature_num= "+sampleNum+" and cd.citation_num = "+citationNum;
		List<Object[]> list = DataUtil.getRecords(query);
		for(Object[] arr: list) {
			rock = new Rock((String)arr[0],(String)arr[1]);
			break;
		}
		return rock;
	}
	
	
}
