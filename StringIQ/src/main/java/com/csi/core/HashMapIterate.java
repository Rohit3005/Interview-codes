package com.csi.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterate {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("AA", "BB");
		map.put("PP", "KK");
		map.put("NN", "MM");
		
		map.forEach((k,v)->{
			
			System.out.println(k+":"+ v);
		});
		
		for (Map.Entry<String,String> entry : map.entrySet()) //using map.entrySet() for iteration  
		{  
		//returns keys and values respectively  
		System.out.println("Item: " + entry.getKey() + ":" + entry.getValue().equals("KK"));   
		}   
		
		String value = map.get("KK");
		System.out.println(value);

	}

}
