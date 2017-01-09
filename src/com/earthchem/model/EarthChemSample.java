package com.earthchem.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-09 
*/
@XmlRootElement(name = "EarthChemSample")
@XmlType(propOrder = {"geography","earthChemData"})
public class EarthChemSample implements Serializable {

	private String ageMax = "";
	private String ageMin = "";
	private String genericDescriptor;
	private String igsn="";
	private String sampleId;
	private String sampleNumber;
	private String source="earthchemdb";
	private String cruiseid;
	private String url="http://www.earthchem.org/petdbWeb/search/sample_info.jsp?sampleID=";
	private Geography geography;
	private EarthChemData earthChemData;
	
	public EarthChemSample() {}


	public EarthChemSample(String genericDescriptor, String igsn, String sampleId, String sampleNumber, String cruiseid,
			Geography geography, EarthChemData earthChemData) {
		super();
		this.genericDescriptor = genericDescriptor;
		this.igsn = igsn;
		this.sampleId = sampleId;
		this.sampleNumber = sampleNumber;
		this.cruiseid = cruiseid;
		this.geography = geography;
		this.earthChemData = earthChemData;
	}

	

	public String getAgeMax() {
		return ageMax;
	}

	@XmlAttribute(name="age_max")
	public void setAgeMax(String ageMax) {
		this.ageMax = ageMax;
	}


	public String getAgeMin() {
		return ageMin;
	}

	@XmlAttribute(name="age_min")
	public void setAgeMin(String ageMin) {
		this.ageMin = ageMin;
	}


	public String getGenericDescriptor() {
		return genericDescriptor;
	}

	@XmlAttribute(name="genericdescriptor")
	public void setGenericDescriptor(String genericDescriptor) {
		this.genericDescriptor = genericDescriptor;
	}


	public String getIgsn() {
		return igsn;
	}

	@XmlAttribute(name="igsn")
	public void setIgsn(String igsn) {
		this.igsn = igsn;
	}


	public String getSampleId() {
		return sampleId;
	}

	@XmlAttribute(name="sample_id")
	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}


	public String getSampleNumber() {
		return sampleNumber;
	}

	@XmlAttribute(name="samplenumber")
	public void setSampleNumber(String sampleNumber) {
		this.sampleNumber = sampleNumber;
	}


	public String getSource() {
		return source;
	}

	@XmlAttribute(name="source")
	public void setSource(String source) {
		this.source = source;
	}


	public String getCruiseid() {
		return cruiseid;
	}

	@XmlAttribute(name="cruiseid")
	public void setCruiseid(String cruiseid) {
		this.cruiseid = cruiseid;
	}


	public String getUrl() {
		return url+sampleId;
	}

	@XmlAttribute(name="url")
	public void setUrl(String url) {
		this.url = url;
	}


	public Geography getGeography() {
		return geography;
	}
	@XmlElement(name="Geography")
	public void setGeography(Geography geography) {
		this.geography = geography;
	}

	public EarthChemData getEarthChemData() {
		return earthChemData;
	}
	@XmlElement(name="EarthChemData")
	public void setEarthChemData(EarthChemData earthChemData) {
		this.earthChemData = earthChemData;
	}
	
	
	
}
