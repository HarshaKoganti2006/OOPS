package com;

public class LogicalOperators {
	public static void main(String[] args) {
		int a =2, b = 4, c = 7;
		System.out.println((a>b) && (a>c)); // False
		System.out.println((a<b) && (a<c)); // True
		System.out.println(!(a>c)); // True
	}
}
