package com.collabera.stringcomparison.comparetomethod;

public class Comparison {

	public static void main(String[] args) {
		String sA = "Hello";
		String sB = "Hello";
		String sC = "Goodbye";
		String sD = "Salutations";
		
		System.out.println(sA.compareTo(sB));
		System.out.println(sA.compareTo(sC));
		System.out.println(sC.compareTo(sA));
		System.out.println(sD.compareTo(sB));
	}

}
