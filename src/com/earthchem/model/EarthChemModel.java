package com.earthchem.model;

import java.io.Serializable;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
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
@XmlRootElement(name = "EarthChemModel")
public class EarthChemModel implements Serializable {

	private String firstResultPosition="0";
	private String majordateupdated="0";
	private String totalResultsAvailable="0";
	private String totalResultsReturned="0";
	private EarthChemSample earthChemSample;
	
	public EarthChemModel() {
	}

	public String getFirstResultPosition() {
		return firstResultPosition;
	}
	@XmlAttribute
	public void setFirstResultPosition(String firstResultPosition) {
		this.firstResultPosition = firstResultPosition;
	}

	public String getMajordateupdated() {
		return majordateupdated;
	}
	@XmlAttribute
	public void setMajordateupdated(String majordateupdated) {
		this.majordateupdated = majordateupdated;
	}

	public String getTotalResultsAvailable() {
		return totalResultsAvailable;
	}
	@XmlAttribute
	public void setTotalResultsAvailable(String totalResultsAvailable) {
		this.totalResultsAvailable = totalResultsAvailable;
	}

	public String getTotalResultsReturned() {
		return totalResultsReturned;
	}
	@XmlAttribute
	public void setTotalResultsReturned(String totalResultsReturned) {
		this.totalResultsReturned = totalResultsReturned;
	}

	public EarthChemSample getEarthChemSample() {
		return earthChemSample;
	}
	@XmlElement (name="EarthChemSample")
	public void setEarthChemSample(EarthChemSample earthChemSample) {
		this.earthChemSample = earthChemSample;
	}
	

	
}
