package com.inventory.store.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Drugs")
public class Drugs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;

	private String drugName;
	private String effcetiveness;

	public Drugs(int ID,String drugName,String effcetiveness){
		this.ID = ID;
		this.drugName = drugName;
		this.effcetiveness = effcetiveness;
	}

	public int getID() {
		return ID;
	}

	public String getDrugName() {
		return drugName;
	}

	public String getEffcetiveness() {
		return effcetiveness;
	}

}
