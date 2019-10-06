package com.collabera.stringcomparison.equalsoperator;

public class Comparison {
	
	public static void main(String[] args) {
		String sA = "Hello";
		String sB = "Hello";
		String sC = new String("Hello");
		
		System.out.println(sA == sB);
		System.out.println(sA == sC);
		
	}
}