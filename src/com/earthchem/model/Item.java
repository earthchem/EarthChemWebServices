package com.earthchem.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
@XmlRootElement(name = "item")
public class Item implements Serializable {
	
	private String group="chemical";
	private String name;
	private String qualityrank="-1";
	private String type;
	private String units;
	private String value;
	private List<Standard> standards;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String name, String type, String units, String value,
			List<Standard> standards) {
		super();
		this.name = name;
		this.type = type;
		this.units = units;
		this.value = value;
		this.standards = standards;
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
	
	
	public List<Standard> getStandards() {
		return standards;
	}

	@XmlElementWrapper(name="standards")
	@XmlElement(name="standard")
	public void setStandards(List<Standard> standards) {
		this.standards = standards;
	}

	@Override
	public String toString() {
		return "Item [group=" + group + ", name=" + name + ", qualityrank=" + qualityrank + ", type=" + type
				+ ", units=" + units + ", value=" + value + ", standards=" + standards + "]";
	}
	
	
	
}
