package com.earthchem.ws;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.earthchem.dao.CitationDao;
import com.earthchem.dao.EarthChemDataDao;
import com.earthchem.dao.EarthChemModelDao;
import com.earthchem.dao.EarthChemSampleDao;
import com.earthchem.dao.GeographyDao;
import com.earthchem.dao.MaterialDao;
import com.earthchem.dao.PhaseDao;
import com.earthchem.dao.SampletypeDao;
import com.earthchem.model.Citation;
import com.earthchem.model.EarthChemData;
import com.earthchem.model.EarthChemModel;
import com.earthchem.model.EarthChemSample;
import com.earthchem.model.Geography;
import com.earthchem.model.Location;
import com.earthchem.model.Material;
import com.earthchem.model.Phase;
import com.earthchem.model.PointType;
import com.earthchem.model.Sampletype;

/**
* Receive request and send xml by web service
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/

@Path("/SampleService")
public class SampleService {

	
	@GET
	@Path("/samples")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey2";
	}
	


	@GET
	@Path("/samples/{sampleNum}")
	@Produces(MediaType.APPLICATION_XML)
	public EarthChemModel getEarthChemModel(@PathParam("sampleNum") int sampleNum){
		System.out.println("bc-EarthChemSample");
		return new EarthChemModelDao().getEarthChemModel(sampleNum);
	}	
}
