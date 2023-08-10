package com.csi.core;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String str = "abcdaa";
		
		Set<Character> set = new HashSet<Character>();
		StringBuilder result = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(set.add(c)) {
				result.append(c);
				
			}
		}
		
		System.out.println(result.toString());
		
	}
	


}
