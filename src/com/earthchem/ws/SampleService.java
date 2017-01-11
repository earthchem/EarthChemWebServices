package com.earthchem.ws;


import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.earthchem.dao.EarthChemModelDao;
import com.earthchem.model.EarthChemModel;


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
		return "Hello Jersey!";
	}
	


	@GET
	@Path("/samples/{sampleNum}")
	@Produces(MediaType.APPLICATION_XML)
	public EarthChemModel getEarthChemModel(@PathParam("sampleNum") int sampleNum){
		EarthChemModel model = new EarthChemModelDao().getEarthChemModel(sampleNum);
		if(model.getEarthChemSample().getSampleId() == null)
		  throw new SampleNotFoundException("<Error>Sample "+sampleNum+" does not exist in EarthChemDB.</Error>");
		return model;
	}	
}
