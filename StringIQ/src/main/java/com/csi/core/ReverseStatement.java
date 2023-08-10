package com.csi.core;

public class ReverseStatement {
	public static void main(String[] args) {

		String[] strings = "The sky is blue".split(" ");
		String ans = "";

		for (int i = strings.length - 1; i >= 0; i--) {
			ans += strings[i] + " ";

		}
		System.out.println(ans);
	}

}
