package com.spring.entity;

public class Emp1 {
  private int id;
  private String name;
  private Address address;
public Emp1() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp1(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
  public void display() {
	  System.out.println("ID = "+id);
	  System.out.println("Name = "+name);
	  System.out.println(address.toString());
  }
}
