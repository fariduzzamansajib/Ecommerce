package com.example.demo;

public class Admin {
	int id;
	String password;
	String name;
	String gender;
	String email;
	String address;
	String phone;

	public Admin() {
		super();
	}

	public Admin(int id, String password, String name, String gender, String email, String address, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", password=" + password + ", name=" + name + ", gender=" + gender + ", email="
				+ email + ", address=" + address + ", phone=" + phone + ", getId()=" + getId() + ", getPassword()="
				+ getPassword() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
