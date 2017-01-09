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
@XmlRootElement(name = "Point")
public class Point implements Serializable {

	private Coord coord;

	public Point() {}
	
	public Point(Coord coord) {
		super();
		this.coord = coord;
	}
	public Coord getCoord() {
		return coord;
	}
	@XmlElement (name="coord")
	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	
	

}
