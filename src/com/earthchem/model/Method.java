package com.earthchem.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "method")
public class Method implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -10962358754942258L;
	
	private String lab;
	private String name;
	private List<Item> items;
	
	public Method(){}
	
	
	public Method(String lab, String name,  List<Item> items) {
	super();
	this.name = name;
	this.lab = lab;
	this.items = items;
	}

	public String getLab() {
		return lab;
	}
	@XmlAttribute
	public void setLab(String lab) {
		this.lab = lab;
	}
	
	public String getName() {
		return name;
	}
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement (name="item")
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Method [name=" + name + ", lab=" + lab + ", items=" + items + "]";
	}

	
}
