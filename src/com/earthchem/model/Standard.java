package com.earthchem.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType
public class Standard implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4298746800703993604L;
	private String name;
	private String value;
	
	public Standard(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}
	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Standard [name=" + name + ", value=" + value + "]";
	}
}
