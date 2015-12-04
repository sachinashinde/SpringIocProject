package com.services;

public class Student {
	private Address address;

	/**
	 * @param address
	 */
	public Student(Address address) {
		super();
		this.address = address;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
