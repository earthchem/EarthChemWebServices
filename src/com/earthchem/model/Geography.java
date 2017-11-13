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
@XmlRootElement(name = "Geography")
@XmlType(propOrder = {"location","precision"})
public class Geography implements Serializable {

	private Location location;
//	private LocationPrecision precision;
	private String precision;
	
	public Geography() {}
	
/*	public Geography(Location location, LocationPrecision precision) {
		super();
		this.location = location;
		this.precision = precision;
	}
*/
	public Geography(Location location, String precision) {
		super();
		this.location = location;
		this.precision = precision;
	}
	
	public Location getLocation() {
		return location;
	}
	@XmlElement(name = "Location")
	public void setLocation(Location location) {
		this.location = location;
	}
/*	public LocationPrecision getPrecision() {
		return precision;
	}
	@XmlElement(name = "Location_Precision")
	public void setPrecision(LocationPrecision precision) {
		this.precision = precision;
	}
*/	
	public String getPrecision() {
		return precision;
	}
	@XmlElement(name = "Location_Precision")
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	
}
