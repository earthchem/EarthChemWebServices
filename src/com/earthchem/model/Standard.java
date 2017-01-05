package com.earthchem.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
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
