package com.earthchem.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/

public class GeometricType implements Serializable {

private String coordinates;

	public GeometricType() {}
	
	public GeometricType(String coordinates) {
	this.coordinates = coordinates;
}

	public String getCoordinates() {
		return coordinates;
	}
	
	@XmlElement(name="coordinates")
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
}
