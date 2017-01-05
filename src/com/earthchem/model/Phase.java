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
@XmlRootElement(name = "Phase")
public class Phase implements Serializable {

	private Rock rock;
	
	public Phase(){}

	public Phase(Rock rock) {
		super();
		this.rock = rock;
	}

	public Rock getRock() {
		return rock;
	}
	@XmlElement (name="ROCK")
	public void setRock(Rock rock) {
		this.rock = rock;
	}

	@Override
	public String toString() {
		return "Phase [rock=" + rock + "]";
	}	
	
	
}
