package com.earthchem.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "item")
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "item", factoryClass = Item.class)
public class Item implements Serializable {
	
	private String group="chemical";
	private String name;
	private String qualityrank="-1";
	private String type;
	private String units;
	private String value;
	private Standards standards;
	

	public Item(String name, String type, String units, String value) {
		super();
		this.name = name;
		this.type = type;
		this.units = units;
		this.value = value;
	}
	
	public Item(String name, String type, String units, String value, Standards standards) {
		super();
		this.name = name;
		this.type = type;
		this.units = units;
		this.value = value;
		this.standards = standards;
	}
	
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public String getGroup() {
		return group;
	}
	@XmlAttribute
	public void setGroup(String group) {
		this.group = group;
	}
	public String getName() {
		return name;
	}
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	public String getQualityrank() {
		return qualityrank;
	}
	@XmlAttribute
	public void setQualityrank(String qualityrank) {
		this.qualityrank = qualityrank;
	}
	public String getType() {
		return type;
	}
	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}
	public String getUnits() {
		return units;
	}
	@XmlAttribute
	public void setUnits(String units) {
		this.units = units;
	}
	public String getValue() {
		return value;
	}
	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}

 	public Standards getStandards() {
		return standards;
	}
 	
	@XmlElement (name="standards", type=Standards.class)
	public void setStandards(Standards standards) {
		this.standards = standards;
	}

	@Override
	public String toString() {
		return "Item [group=" + group + ", name=" + name + ", qualityrank=" + qualityrank + ", type=" + type
				+ ", units=" + units + ", value=" + value + ", standards=" + standards + "]";
	}
	
	
	
}
