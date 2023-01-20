package com.spring.entity;

public class Address {
  private String city;
  private String sname;
  private String country;
public Address(String city, String ename, String country) {
	super();
	this.city = city;
	this.sname = ename;
	this.country = country;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [city=" + city + ", sname=" + sname + ", country=" + country + "]";
}
  
}
