package com.csi.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReapeatedWord {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("JAVA", "PYTHON", "JAVA", "REACT", "JAVA");

		Map<String, Long> result = name.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
	}
}
