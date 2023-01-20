package com.spring.entity;

import java.util.Iterator;
import java.util.List;

public class Mcq {
   private int id;
   private String name;
   private List<String> ans;
public Mcq(int id, String name, List<String> ans) {
	super();
	this.id = id;
	this.name = name;
	this.ans = ans;
}
   public void display() {
	   System.out.println(id+" "+name);
	   System.out.println("Answers are : ");
	   Iterator<String> itr =ans.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
   }
}
