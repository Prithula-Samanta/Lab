/*
 * Hands-on Exercise 2
Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by
both.

 */
package com.Lab;

public class DivisibleBy3And5 {
  public static void main(String[] args) {
	  System.out.println("Numbers which are only divisible by 3");
	for(int i=1;i<=100;i++) {
		if(i%3==0) {    
			System.out.print(i+",");
		}
	}
	System.out.println();
	 System.out.println("Numbers which are only divisible by 5");
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				System.out.print(i+",");
			}
		}
		System.out.println();
			 System.out.println("Numbers which are divisible by 3 and 5 that means divisible by 15");
				for(int i=1;i<=100;i++) {
					if(i%3==0 && i%5==0) {
						System.out.print(i+",");
					}
				}
    }
}
