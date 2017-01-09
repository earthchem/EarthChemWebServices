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
* @since   2017-01-04 
*/
@XmlRootElement(name = "Location")
@XmlType(propOrder = {"pointType","lineStringType","precision"})
public class Location_old implements Serializable {

	private PointType pointType;
	private LineStringType lineStringType;
	private String precision;

	public Location_old() {}
	
	
	
	public Location_old(PointType pointType, LineStringType lineStringType, String precision) {
		super();
		this.pointType = pointType;
		this.lineStringType = lineStringType;
		this.precision = precision;
	}



	public PointType getPointType() {
		return pointType;
	}
	
	@XmlElement (name="Point")
	public void setPointType(PointType pointType) {
		this.pointType = pointType;
	}
	
	
	public LineStringType getLineStringType() {
		return lineStringType;
	}

	@XmlElement (name="LineString")
	public void setLineStringType(LineStringType lineStringType) {
		this.lineStringType = lineStringType;
	}

	public String getPrecision() {
		return precision;
	}
	
	@XmlElement (name="Location_Precision")
	public void setPrecision(String precision) {
		this.precision = precision;
	}




}
