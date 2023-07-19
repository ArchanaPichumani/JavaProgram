package org.array;

public class ArrayString {
	
	
	public static void main(String[]args) {
		
	String a[]= new String[4];
	
	      a[0]="Java Program";
	      a[1]="Java Program";
	      a[2]="Python";
	      a[3]="Main Frame";
	      
	      System.out.println("Names of Programming Language:");
	      
	       for (int i = 0; i < a.length; i++) {
	         
	        System.out.println(a[i]);	
			       
	        	
	}
	       boolean s=a[0].equals(a[1]);
	       System.out.println(s);
	       
	       
	}
}
	