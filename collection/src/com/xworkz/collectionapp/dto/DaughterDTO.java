package com.xworkz.collectionapp.dto;

import java.io.Serializable;

public class DaughterDTO implements Serializable {

	private String name;
	private long mobile;
	private int age;
	private boolean iscommitted;
	private boolean alive;

	public DaughterDTO() {

	}

	public DaughterDTO(String name, long mobile, int age, boolean iscommitted, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.iscommitted = iscommitted;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", iscommitted=" + iscommitted
				+ ", alive=" + alive + "]";
	}

	@Override
	public int hashCode() {
		return 28;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof DaughterDTO) {
				DaughterDTO dto = (DaughterDTO) obj;
				if (dto.name.equals(dto.name) && dto.age == this.age) {

				}
				return true;
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

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int size) {
		this.age = age;
	}

	public boolean isIscommitted() {
		return iscommitted;
	}

	public void setIscommitted(boolean iscommitted) {
		this.iscommitted = iscommitted;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
