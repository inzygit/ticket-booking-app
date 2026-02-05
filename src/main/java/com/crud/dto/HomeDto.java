package com.crud.dto;

public class HomeDto {

	private long id;
	
	private String name;
	
	private byte age;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public byte getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(byte age) {
		this.age = age;
	}
	
	
}
