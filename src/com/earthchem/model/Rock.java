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
@XmlRootElement(name = "ROCK")
@XmlType(propOrder = {"rockclass","rockname"})
public class Rock implements Serializable {

	private String rockclass;
	private String rockname;

	public Rock() {}

	public Rock(String rockclass, String rockname) {
		super();
		this.rockclass = rockclass;
		this.rockname = rockname;
	}

	public String getRockclass() {
		return rockclass;
	}
	@XmlElement
	public void setRockclass(String rockclass) {
		this.rockclass = rockclass;
	}

	public String getRockname() {
		return rockname;
	}
	@XmlElement
	public void setRockname(String rockname) {
		this.rockname = rockname;
	}

	@Override
	public String toString() {
		return "Phase [rockclass=" + rockclass + ", rockname=" + rockname + "]";
	}
	
	

}
