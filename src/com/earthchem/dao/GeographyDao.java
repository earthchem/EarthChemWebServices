package com.earthchem.dao;


import java.util.List;

import com.earthchem.model.Coord;
import com.earthchem.model.Geography;
import com.earthchem.model.Location;
import com.earthchem.model.Point;
import com.earthchem.util.DataUtil;
/**
* Retrieve data from database for Geography tag and its child tags in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-09 
*/
public class GeographyDao {
	
	public Geography getGeography(int sampleNum) {
		Geography geography = new Geography();
		String query="SELECT ST_AsText(s.feature_geometry) FROM sampling_feature s where s.sampling_feature_num = "+sampleNum;
		List<Object[]> list = DataUtil.getRecords(query);
		for(Object[] arr: list) {
			String s =  (String) arr[0];
			s = s.substring(s.indexOf("(")+1,s.indexOf(")"));
			String [] a = s.split(",");
			String [] g = a[0].split(" ");
			Coord coord = new Coord(g[0],g[1]);
			Location location = new Location(new Point(coord));
			geography.setLocation(location);
			if(g.length==3) {
				geography.setPrecision(g[2]);
			}
			break;
		}
		return geography;
	}
	
}
