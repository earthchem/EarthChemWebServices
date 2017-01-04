package com.earthchem.ws;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.earthchem.dao.MaterialDao;
import com.earthchem.model.Location;
import com.earthchem.model.Material;
import com.earthchem.model.Method;
import com.earthchem.model.PointType;

@Path("/SampleService")
public class SampleService {
/*	
	
	*/
	
	@GET
	@Path("/samples")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}
	
	@GET
	@Path("/locations")
	@Produces(MediaType.APPLICATION_XML)
	public Location getLocation() {
	//	Location location = new Location(null, new LineStringType("fff"),("345"));
		Location location = new Location(new PointType("fff"),null,null);
		return  location;
	}
	
	
	@GET
	@Path("/samples/{sampleNum}")
	@Produces(MediaType.APPLICATION_XML)
	public Material getSample(@PathParam("sampleNum") int sampleNum){
		return new MaterialDao().getMaterial(26197, "1282");
	}
		
}
