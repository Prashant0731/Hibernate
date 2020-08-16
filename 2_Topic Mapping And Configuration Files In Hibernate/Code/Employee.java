package com.test;

public class Employee {

// private variable 
	private Integer eId; 
	private String eName;
	private String eDesignation;
	
// setter & getter methods
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

// toString 
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDesignation=" + eDesignation + "]";
	}
}
