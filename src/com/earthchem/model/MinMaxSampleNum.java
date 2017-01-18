package com.earthchem.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-18 
*/

@XmlRootElement(name = "Results")
@XmlType(propOrder = {"minSampleNum","maxSampleNum"})
public class MinMaxSampleNum implements Serializable {
	private int minSampleNum;
	private int maxSampleNum;
	
	public MinMaxSampleNum() {
//		super();
		// TODO Auto-generated constructor stub
	}



	public MinMaxSampleNum(int minSampleNum, int maxSampleNum) {
	//	super();
		this.minSampleNum = minSampleNum;
		this.maxSampleNum = maxSampleNum;
	}



	public int getMinSampleNum() {
		return minSampleNum;
	}


	@XmlElement(name="MinSampleNum")
	public void setMinSampleNum(int minSampleNum) {
		this.minSampleNum = minSampleNum;
	}



	public int getMaxSampleNum() {
		return maxSampleNum;
	}


	@XmlElement(name="MaxSampleNum")
	public void setMaxSampleNum(int maxSampleNum) {
		this.maxSampleNum = maxSampleNum;
	}



	@Override
	public String toString() {
		return "MinMaxSampleNum [minSampleNum=" + minSampleNum + ", maxSampleNum=" + maxSampleNum + "]";
	}
	
	
	

}
