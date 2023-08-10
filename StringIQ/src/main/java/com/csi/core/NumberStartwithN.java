package com.csi.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartwithN {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(14, 45, 6, 63, 2, 17, 2, 1, 010, 10, 1000, 145, 6541, 187);

		List<Integer> result = integers.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(result);
	}

}
