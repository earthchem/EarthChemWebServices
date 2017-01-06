package com.earthchem.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
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
//@XmlRootElement(name = "Material")
public class Material {
	private String materialdescription;
	private String materialtype; 
	private String mineralname;
	private List <Method> methods;
	
	public Material(){}

	public Material(String materialdescription, String materialtype, String mineralname, List<Method> methods) {
		super();
		this.materialdescription = materialdescription;
		this.materialtype = materialtype;
		this.mineralname = mineralname;
		this.methods = methods;
	}

	public String getMaterialdescription() {
		return materialdescription;
	}
	@XmlAttribute
	public void setMaterialdescription(String materialdescription) {
		this.materialdescription = materialdescription;
	}

	public String getMaterialtype() {
		return materialtype;
	}
	@XmlAttribute
	public void setMaterialtype(String materialtype) {
		this.materialtype = materialtype;
	}

	public String getMineralname() {
		return mineralname;
	}
	@XmlAttribute
	public void setMineralname(String mineralname) {
		this.mineralname = mineralname;
	}

	public List<Method> getMethods() {
		return methods;
	}
	@XmlElement (name="method")
	public void setMethods(List<Method> methods) {
		this.methods = methods;
	}

	@Override
	public String toString() {
		return "Material [materialdescription=" + materialdescription + ", materialtype=" + materialtype
				+ ", mineralname=" + mineralname + ", methods=" + methods + "]";
	}
	
	
}
