package com.earthchem.model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
* Java bean used in Jersey
*
* @author  Bai
* @version 1.0
* @since   2017-01-04 
*/
@XmlType
public class Items implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4055626793004480671L;
	private List<Item> items;

	
	public Items(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	

	
	
}
