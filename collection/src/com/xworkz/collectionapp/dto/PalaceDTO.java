package com.xworkz.collectionapp.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable {
    
	private String name;
	private String location;
	private String builtBy;
	private boolean isDestroyed;
	private double visitingFees;
	
	public PalaceDTO() {
		
	}

	public PalaceDTO(String name, String location, String builtBy, boolean isDestroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.isDestroyed = isDestroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", isDestroyed="
				+ isDestroyed + ", visitingFees=" + visitingFees  + "]";
	}
	
	@Override
	public int hashCode() {
		return 45;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if(obj!=null) {
	    	if(obj instanceof PalaceDTO) {
	    		PalaceDTO dto = (PalaceDTO)obj;
	    		if(dto.name.equals(dto.name) && dto.visitingFees==this.visitingFees) {
	    			
	    		}return true;
	    	}
	    }
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return isDestroyed;
	}

	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}
	
}
