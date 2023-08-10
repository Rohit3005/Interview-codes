package com.csi.core;

public class SwappedString {
	public static void main(String[] args) {

		String s1 = "Java";

		String s2 = "Python";

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println("S1:" + s1 + "\n" + "s2:" + s2);

		int a = 10;
		int b = 41;

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("\n a:" + a + "\n b:"+ b);
	}

}
