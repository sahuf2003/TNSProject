package com.cg.pm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	private long id;
	private String name;
	private String type;
	private String password;
	
	public User() {
		super();
	}
	
	public User(long id, String name, String type, String password) {
	super();
	this.id = id;
	this.name= name;
	this.type = type;
	this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", type=" + type + ", password=" + password + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
