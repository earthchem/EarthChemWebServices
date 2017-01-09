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
@XmlRootElement(name = "coord")
@XmlType(propOrder = {"x","y"})
public class Coord implements Serializable {

	private String x;
	private String y;
	
	public Coord() {}
	public Coord(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String getX() {
		return x;
	}
	@XmlElement (name="X")
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	@XmlElement (name="Y")
	public void setY(String y) {
		this.y = y;
	}

	
}
