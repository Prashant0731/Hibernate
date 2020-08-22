package com.airlines.test;

public class Airline {


	private Integer aId;
	private String aName;
	private String aType;
	private String aCountry;
	
	/**
	 * @return the aId
	 */
	public Integer getaId() {
		return aId;
	}
	/**
	 * @param aId the aId to set
	 */
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	/**
	 * @return the aName
	 */
	public String getaName() {
		return aName;
	}
	/**
	 * @param aName the aName to set
	 */
	public void setaName(String aName) {
		this.aName = aName;
	}
	/**
	 * @return the aType
	 */
	public String getaType() {
		return aType;
	}
	/**
	 * @param aType the aType to set
	 */
	public void setaType(String aType) {
		this.aType = aType;
	}
	/**
	 * @return the aCountry
	 */
	public String getaCountry() {
		return aCountry;
	}
	/**
	 * @param aCountry the aCountry to set
	 */
	public void setaCountry(String aCountry) {
		this.aCountry = aCountry;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airline [aId=" + aId + ", aName=" + aName + ", aType=" + aType + ", aCountry=" + aCountry + "]";
	}
	
	
}
