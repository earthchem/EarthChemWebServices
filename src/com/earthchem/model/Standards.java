package com.earthchem.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
@XmlType
public class Standards implements Serializable {
	
	private static final long serialVersionUID = -795697997299889185L;
	private List<Standard> standars;

	public Standards(List<Standard> standars) {
		
		this.standars = standars;
	}
	
	public List<Standard> getStandars() {
		return standars;
	}

	@XmlElement (name="standard")
	public void setStandars(List<Standard> standars) {
		this.standars = standars;
	}

	@Override
	public String toString() {
		return "Standards [standars=" + standars + "]";
	}
	
	
}
