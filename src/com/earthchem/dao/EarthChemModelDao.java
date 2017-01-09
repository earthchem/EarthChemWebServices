package com.earthchem.dao;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import com.earthchem.model.EarthChemModel;
import com.earthchem.model.EarthChemSample;

/**
* Retrieve data from database for EarthChemModel tag in XML file.
*
* @author  Bai
* @version 1.0
* @since   2017-01-09 
*/
public class EarthChemModelDao {
	
	public EarthChemModel getEarthChemModel(int sampleNum) {
		EarthChemModel model = new EarthChemModel();
		 
		EarthChemSample ecs = new EarthChemSampleDao().getEarthChemSample(sampleNum);
		model.setEarthChemSample(ecs);
		try{
	          JAXBContext jc = JAXBContext.newInstance(EarthChemModel.class);     
	          Marshaller marshaller = jc.createMarshaller();
	          marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	          marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.earthchemportal.org http://www.earthchemportal.org/schema/earthchem_v26.xsd");
	          marshaller.marshal(model, System.out);
	      } catch (Exception ex){} 
		return model;
		
	}
	
}
