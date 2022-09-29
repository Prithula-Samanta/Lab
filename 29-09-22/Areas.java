package com.cognizant.shapes;

public class Areas {
  public static void main(String[] args) {
		Circle obj2= new Circle(5.6f);
		Circle obj3= new Circle(10.0f,3.14f);
	System.out.println("The area of the circle is "+obj3.calculateCircleArea(4));
	System.out.println("The circumference of the circle is "+obj3.calculateCircumference(7));
}
}
