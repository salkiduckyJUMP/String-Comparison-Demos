package com.collabera.stringcomparison.equalsmethod;

public class Comparison {
	
	public static void main(String[] args) {
		String sA = "Hello";
		String sB = "Hello";
		String sC = new String("Hello");
		String sD = "Goodbye";
		
		System.out.println(sA.equals(sB));
		System.out.println(sB.equals(sC));
		System.out.println(sC.equals(sD));
		System.out.println(sA.equals(sD));
	}

}
