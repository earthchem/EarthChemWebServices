package com.earthchem.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-06 
*/

@XmlRootElement(name = "EarthChemData")
public class EarthChemData implements Serializable {
	
	private List<Citation> citations;

	public List<Citation> getCitations() {
		return citations;
	}
	@XmlElement(name="Citation")
	public void setCitations(List<Citation> citations) {
		this.citations = citations;
	}
	
	
}
