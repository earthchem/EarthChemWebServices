package com.earthchem.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;


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
