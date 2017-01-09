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
@XmlRootElement(name = "Location")
public class Location implements Serializable {

	private Point point;
	
	public Location() {
	}

	public Location(Point point) {
		super();
		this.point = point;
	}

	public Point getPoint() {
		return point;
	}
	@XmlElement (name="Point")
	public void setPoint(Point point) {
		this.point = point;
	}
	
	

	
}
