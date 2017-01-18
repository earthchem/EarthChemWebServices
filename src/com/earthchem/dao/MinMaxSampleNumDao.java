package com.earthchem.dao;


import java.util.ArrayList;
import java.util.List;

import com.earthchem.model.Citation;
import com.earthchem.model.MinMaxSampleNum;
import com.earthchem.util.DataUtil;
/**
* Retrieve min and max sample numbers from database for Results tag and its child tags in XML file.  
*
* @author  Bai
* @version 1.0
* @since   2017-01-18 
*/
public class MinMaxSampleNumDao {
	
	public MinMaxSampleNum getMinMaxSampleNum() {
		String query ="select min(s.sampling_feature_num), max(s.sampling_feature_num)  from specimen sp, sampling_feature s, material m where s.sampling_feature_num = sp.sampling_feature_num and sampling_feature_type_num = 1 and sp.material_num = m.material_num and m.material_code = 'ROCK'";
		List<Object[]> list = DataUtil.getRecords(query);
		MinMaxSampleNum minMaxSampleNum = null;
		for(Object[] arr: list) {
			minMaxSampleNum = new MinMaxSampleNum((Integer)arr[0],(Integer)arr[1]);
		}
		return minMaxSampleNum;		
	}
	
}
