package com.csi.core;

public class Mysingleton {
	
	private static Mysingleton mysingleton;
	
	static {
		mysingleton = new Mysingleton();
	}
	
	private Mysingleton() {
		
	}
	public static Mysingleton getInstance() {
		return mysingleton;
	}

}
