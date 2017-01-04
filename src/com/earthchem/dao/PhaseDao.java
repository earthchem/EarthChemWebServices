package com.earthchem.dao;

import java.util.ArrayList;
import java.util.List;

import com.earthchem.model.Item;
import com.earthchem.model.Items;
import com.earthchem.model.Material;
import com.earthchem.model.Method;
import com.earthchem.model.Standard;
import com.earthchem.model.Standards;
import com.earthchem.util.DataUtil;

public class PhaseDao {
	
	/*
	public Material getMaterial(int sampleNum, String citationNum) {
	//	List<Method> methodList = getMethod(26197, "1282");
		List<Method> methodList = getMethod(sampleNum, citationNum);
		Material material = new Material("materialdes", "materialtype", "Slname", methodList); 		
		return material;
	}
	
	
	public List<Method> getMethod(int sampleNum, String citationNum) {
		String query ="select distinct m.method_code, o.organization_name, m.method_num, o.organization_num "+
		" from  action a,  method m,  organization o, sampling_feature s, feature_action fa, citation_dataset cd "+
		" where m.method_num = a.method_num  and cd.dataset_num = a.dataset_num "+
		" and o.organization_num = a.organization_num "+
		" and s.sampling_feature_num = fa.sampling_feature_num and fa.action_num = a.action_num "+
		" and s.sampling_feature_num = "+sampleNum+" and cd.citation_num = "+citationNum+
		" order by method_num, o.organization_num";

		List<Method> methodList = new ArrayList<Method>();
		List<Object[]> list = DataUtil.getRecords(query);
		for(Object[] arr: list) {
			List<Item> itemList = getItems(sampleNum, ""+citationNum,""+arr[2],""+arr[3]);
			if(itemList != null && itemList.size() > 0 ) {
				Method method = new Method((String)arr[1], (String)arr[0], itemList);
				methodList.add(method);
			}			
		}
		
		return methodList;
	}
	
	public List<Item> getItems(int sampleNum, String citationNum, String methodNum, String orgNum) {
		String query = "select distinct v.variable_code, vt.variable_type_code, u.unit_name, n.value_meas, r.result_num "+
		" from sampling_feature s, feature_action fa, action ac, method m,  result r, numeric_data n, unit u, variable v, "+
		" variable_type vt, dataset_result dr, citation_dataset cd, related_result rr "+
		" where fa.sampling_feature_num = s.sampling_feature_num and fa.action_num = ac.action_num and m.method_num = ac.method_num "+    
		" and r.feature_action_num = fa.feature_action_num and r.result_num = n.result_num and u.unit_num = n.unit_num "+
		" and v.variable_num = r.variable_num and v.variable_type_num = vt.variable_type_num and dr.result_num = r.result_num "+
		" and cd.dataset_num = dr.dataset_num and rr.result_num = r.result_num "+
		" and s.sampling_feature_num = "+sampleNum+" and m.method_num ="+methodNum+
		" and cd.citation_num = "+citationNum+" and ac.organization_num = "+orgNum;
	
		List<Item> itemList = new ArrayList<Item>();
		List<Object[]> list = DataUtil.getRecords(query);
		for(Object[] arr: list) {
			Standards standards = getStandards(""+ arr[4]);
			itemList.add(new Item((String)arr[0],(String)arr[1], (String)arr[2],""+arr[3],standards));		
		}
		return itemList;
	}
	
	public Standards getStandards(String resultNum) {
		String query ="select sd.sampling_feature_code  standard_name, nd.value_meas standard_value "+
		" from related_result rr,  relationship_type rt,  result rd, numeric_data nd, feature_action fd, sampling_feature sd "+
		" where rr.relationship_type_num = rr.relationship_type_num and rt.relationship_type_name = 'IsStandardizedBy' "+ 
		" and rd.result_num = rr.related_result_num and rd.result_num = nd.result_num "+
		" and fd.feature_action_num = rd.feature_action_num and fd.sampling_feature_num = sd.sampling_feature_num "+
		" and sd.sampling_feature_description = 'Reference Material' "+
		" and rr.result_num ="+resultNum;
		List<Standard> standardList = new ArrayList<Standard>();
		List<Object[]> list = DataUtil.getRecords(query);
		for(Object[] arr: list) {
			standardList.add(new Standard((String)arr[0],""+arr[1]));
		}
		return  new Standards(standardList);
	}
	*/
}
