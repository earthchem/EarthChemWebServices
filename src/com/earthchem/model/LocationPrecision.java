package com.earthchem.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-09 
*/
@XmlRootElement(name = "Location_Precision")
public class LocationPrecision implements Serializable {

	private String precision;

	public LocationPrecision() {}
	
	public LocationPrecision(String precision) {
		super();
		this.precision = precision;
	}

	public String getPrecision() {
		return precision;
	}

	@XmlElement
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	
	
}
