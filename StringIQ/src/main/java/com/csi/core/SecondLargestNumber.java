package com.csi.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 8, 7, 6, 4, 58);

		long result = list.stream().sorted(Comparator.comparingLong(Integer::intValue).reversed())
				.collect(Collectors.toList()).get(1);
		
		System.out.println(result);
	}

}
