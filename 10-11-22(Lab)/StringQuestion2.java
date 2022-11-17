package com.Assignments;
	
	class StringQuestion2{
		
	    public static void main(String[] args) {
	        String str="java_Question";
	        boolean flag=false;
	        for (int i = 0; i < str.length(); i++) {
	            if(str.charAt(i)=='_'){  // checking inside the string underscode is present or not 
	                char ch=str.charAt(i+1); // if present then come to the next chracter 
	                if(Character.isLowerCase(ch)){  // new  check the character is lowercase or not 
	                    flag=true;
	                }
	            }
	        }
	        if(flag){
	            System.out.println("Matched");
	        }
	        else {
	            System.out.println("Not Matched");
	        }
	    }
	}

     
//			if(str.matches("^[a-z]+_[a-z]+$")){   // this is predefined String method 
//				System.out.println("Found a match");
//			
//		}
//		else 
//		{
//				System.out.println("Not found");
//			}
//	int count =0;
//	for(int i=0;i<str.length();i++) {
//		if(str.charAt(i)=='_' && str.charAt(i+1)=='e'){
//			count++;
//			break;
//		}
//		
//		
//	}
//	if(count==0) {
//		System.out.println("Not found");
//	}
//	else {
//		System.out.println("Match Found");
//	}
	
//	}
//}