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
* @since   2017-01-06 
*/

@XmlRootElement(name = "Citation")
//@XmlType(propOrder = {"Title","Author","Sampletype"})
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"title","authors"})
public class Citation implements Serializable {
	private String journal;
	private String year;
	private String pages;
	private String doi;
	private String title;
	private List<String> authors;
	
	public String getJournal() {
		return journal;
	}
	@XmlAttribute
	public void setJournal(String journal) {
		this.journal = journal;
	}
	public String getYear() {
		return year;
	}
	@XmlAttribute
	public void setYear(String year) {
		this.year = year;
	}
	public String getPages() {
		return pages;
	}
	@XmlAttribute
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getDoi() {
		return doi;
	}
	@XmlAttribute
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getTitle() {
		return title;
	}
	@XmlElement(name="Title")
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	@XmlElement(name="Author")
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	
	
	/*	private List<String> authors;
	

	private String journal;
	private String year;
	private String pages;
	private String doi;
	private String title;
	private List<String> authors;
	private Sampletype sampletype;
	
	public  Citation() {}

	public Citation(String journal, String year, String pages, String doi, String title, List<String> authors,
			Sampletype sampletype) {
		super();
		this.journal = journal;
		this.year = year;
		this.pages = pages;
		this.doi = doi;
		this.title = title;
		this.authors = authors;
		this.sampletype = sampletype;
	}

	public String getJournal() {
		return journal;
	}
	@XmlAttribute
	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getYear() {
		return year;
	}
	@XmlAttribute
	public void setYear(String year) {
		this.year = year;
	}

	public String getPages() {
		return pages;
	}
	@XmlAttribute
	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getDoi() {
		return doi;
	}
	@XmlAttribute
	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTitle() {
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthors() {
		return authors;
	}
	@XmlElement(name="Author")
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Sampletype getSampletype() {
		return sampletype;
	}
	@XmlElement
	public void setSampletype(Sampletype sampletype) {
		this.sampletype = sampletype;
	}

	@Override
	public String toString() {
		return "Citation [journal=" + journal + ", year=" + year + ", pages=" + pages + ", doi=" + doi + ", title="
				+ title + ", authors=" + authors + ", sampletype=" + sampletype + "]";
	}
	
*/	
	
}
