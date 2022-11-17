package com.Assignments;
/*
 * Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.

 */
public class AddTwoPositive {
  public void addTwoPositive(int a, int b) throws ArithmeticException{
	  try {
	  if(a < 0|| b<0) {
		  throw new ArithmeticException("Non-positive integer");  // throw an exception 
	  }
	  else {
		  System.out.println("The sum of two number is "+(a+b));
	  }
	 }
	  finally {
		  System.out.println("End of the program ");  // it must be execute 
	  }
  }
  public static void main(String[] args) {
	AddTwoPositive obj = new AddTwoPositive();
	obj.addTwoPositive(45,-54);
}
}