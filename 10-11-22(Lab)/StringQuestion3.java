package com.Assignments;

import java.util.Scanner;

/*
 * Write a Java program to remove duplicate characters from a given string presents in another given string. 
Sample Output: 
The given String is: Anudip Foundation Skill & career development centre.
The given mask string is – Famous
The new string is: Without all letters 

 */


class StringQuestion3{
    public static void main(String[] args) {
        String str1 = "Anudip Foundation Skill & career development centre";
        String str2="Famous";
        for (int i = 0; i < str1.length(); i++) {
             boolean b=false;
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    b=true;
                    break;
                }
            }
            if(b==false) {
                System.out.print(str1.charAt(i));
            }
        }
    }
}
