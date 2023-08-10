package com.csi.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IterateMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("AA", "BB");
		map.put("PP", "KK");
		map.put("NN", "MM");

		// Iterate over the map's entry set
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();

			// Check if the value is "KK"
			if ("KK".equals(value)) {
				System.out.println("Key: " + key + ", Value: " + value);
			}
		}
		
		List<String> list = new ArrayList<String>();
		list.add("CAT");
		list.add("TIGER");
		list.add("DOG");
		
		list.stream().filter(a-> a.equals("TIGER")).forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(1,2,5,6,2,5,7,8);
		
		int sum =  list2.stream().filter(i-> i % 2 == 0).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
	}
}
