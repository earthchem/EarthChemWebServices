package com.earthchem.dao;


import java.util.ArrayList;
import java.util.List;
import com.earthchem.model.Material;
import com.earthchem.model.Sampletype;
import com.earthchem.util.DataUtil;
/**
* Retrieve data from database for Sampletype tag and its child tag in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
public class SampletypeDao {
	
	public Sampletype getSampletype(int sampleNum, String citationNum) {
		Sampletype sampletype = new Sampletype();
		sampletype.setPhase(new PhaseDao().getPhase(sampleNum, ""+citationNum));
		sampletype.setMaterials(getMaterials(sampleNum, ""+citationNum));
		
		return sampletype;
		
	}
	
	
	public List<Material> getMaterials(int sampleNum, String citationNum) {
		List<Material> materials = new ArrayList<Material>();
		String query="select distinct s.sampling_feature_num "+
		" from sampling_feature s "+
		" join specimen sp on sp.sampling_feature_num = s.sampling_feature_num "+
		" join feature_action fa on s.sampling_feature_num = fa.sampling_feature_num "+
		" join action ac on fa.action_num = ac.action_num "+
		" join dataset ds  on ac.dataset_num = ds.dataset_num "+
		" join citation_dataset cd on cd.dataset_num =ds.dataset_num "+
		" where cd.citation_num = "+citationNum+" and s.sampling_feature_code in "+
		" (select sampling_feature_code from sampling_feature where sampling_feature_num ="+sampleNum+")"; 
		List<Object[]> list = DataUtil.getRecords(query);
		MaterialDao materialDao = new MaterialDao();
		for(Object[] arr: list) {
			Material material = materialDao.getMaterial((Integer)arr[0], citationNum);
			materials.add(material);
		}
		return materials;
	}
	
	
}
