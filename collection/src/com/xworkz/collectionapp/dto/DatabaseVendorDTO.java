package com.xworkz.collectionapp.dto;

import java.io.Serializable;

import com.xworkz.collectionapp.streams.Type;

public class DatabaseVendorDTO implements Serializable {

	private String name;
	private String developedBy;
	private int size;
	private double licenceCost;
	private Type type;
	
	public DatabaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DatabaseVendorDTO(String name, String developedBy, int size, double licenceCost, Type type) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenceCost = licenceCost;
		this.type = type;
	}

	@Override
	public String toString() {
		return "DatabaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenceCost="
				+ licenceCost + ", type=" + type + "]";
	}
	
	@Override
	public int hashCode() {
		return 50;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof DatabaseVendorDTO) {
				DatabaseVendorDTO DTO = (DatabaseVendorDTO)obj;
				if(DTO.name.equals(this.name) && DTO.size == this.size ) {
					
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLicenceCost() {
		return licenceCost;
	}

	public void setLicenceCost(double licenceCost) {
		this.licenceCost = licenceCost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
}
