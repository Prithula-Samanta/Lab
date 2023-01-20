package com.spring.entity;

public class Student {
   private int id;
   private String name;
   private String email;
   private long phone;
public Student(int id, String name, String email, long phone) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
}
   public void display() {
	   System.out.println(id+" "+name+" "+email+" "+phone);
   }
}
