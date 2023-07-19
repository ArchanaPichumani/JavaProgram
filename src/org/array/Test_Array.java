package org.array;

public class Test_Array {
	
	
	 
	 public static void main(String [] args) {
		 
		 int w[]=new int[3];
		 w[0] = 5;
		 w[1] = 10;
		 w[2] = 15;
		 
		 System.out.println(w[2]);
		 
		int length = w.length;
		System.out.println(length);
		 
		 for (int i=0; i<3; i++) {
		System.out.println(w[i]);
	 }
	 }
}
