package com.csi.core;


import java.util.Map;
import java.util.stream.Collectors;

public class ReapeatedCharacter {
	public static void main(String[] args) {

		String string = "Ahemadnagar";
		string = string.toLowerCase();

		Map<Character, Long> result = string.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		result.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + ":" + v);
			}
		});
		
		System.out.println(result);
	}

}
