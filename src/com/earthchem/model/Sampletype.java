package com.earthchem.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
@XmlRootElement(name = "Sampletype")
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"phase","materials"})
public class Sampletype implements Serializable {

	private Phase phase;
	private List<Material> materials;
	
	public Sampletype() {}
	
	
	
	public Sampletype(Phase phase, List<Material> materials) {
		super();
		this.phase = phase;
		this.materials = materials;
	}

	public Phase getPhase() {
		return phase;
	}
	@XmlElement(name="Phase")
	public void setPhase(Phase phase) {
		this.phase = phase;
	}

	public List<Material> getMaterials() {
		return materials;
	}
	
	@XmlElement(name="Material")
	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}
	
	
	
}
