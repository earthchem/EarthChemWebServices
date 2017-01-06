package com.earthchem.dao;


import java.util.ArrayList;
import java.util.List;

import com.earthchem.model.Citation;
import com.earthchem.util.DataUtil;
/**
* Retrieve data from database for Citation tag and its child tags in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-06 
*/
public class CitationDao {
	
	public Citation getCitation(int sampleNum, String citationNum) {
		String query ="select distinct c.journal, c.publication_year, c.first_page, c.last_page,"+
		" i.citation_external_identifier, c.title,  p.last_name||', '||p.first_name author, al.author_order "+
		" from citation c "+
		" join citation_dataset cd on  c.citation_num = cd.citation_num "+
		" join dataset d on cd.dataset_num = d.dataset_num "+
		" join author_list al on c.citation_num = al.citation_num "+
		" join person p on p.person_num = al.person_num "+
		" left join citation_external_identifier i on i.citation_num = c.citation_num "+
		" where c.citation_num = "+citationNum+" order by al.author_order";
		List<String> authorList = new ArrayList<String>();
		List<Object[]> list = DataUtil.getRecords(query);
		Citation citation = new Citation();
		int i = 0;
		for(Object[] arr: list) {
			if(i== 0) {
				citation.setJournal((String)arr[0]);
				citation.setYear(""+arr[1]);
				citation.setDoi((String)arr[4]);
				citation.setTitle((String)arr[5]);
				String pages = "";
				if(arr[2] != null && arr[3] != null) pages = ""+arr[2]+"-"+arr[3];
				citation.setPages(pages);
			}
			authorList.add((String)arr[6]);
			i++;
		}
		citation.setAuthors(authorList);
		citation.setSampletype(new SampletypeDao().getSampletype(sampleNum, citationNum));
		return citation;		
	}
	
}
