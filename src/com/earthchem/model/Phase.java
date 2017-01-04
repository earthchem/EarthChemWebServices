package com.earthchem.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Phase")
@XmlType(propOrder = {"rockclass","lineStringType","precision"})
public class Phase implements Serializable {

	private String rockclass;
	private String rockname;

	public Phase() {}

	public Phase(String rockclass, String rockname) {
		super();
		this.rockclass = rockclass;
		this.rockname = rockname;
	}

	public String getRockclass() {
		return rockclass;
	}

	public void setRockclass(String rockclass) {
		this.rockclass = rockclass;
	}

	public String getRockname() {
		return rockname;
	}

	public void setRockname(String rockname) {
		this.rockname = rockname;
	}

	@Override
	public String toString() {
		return "Phase [rockclass=" + rockclass + ", rockname=" + rockname + "]";
	}
	
	

}
