package com.csi.core;

public class SortArrayWithoutUsingFunction {
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,6,6,9,47,2};
		
		int n = arr.length;
		
		for(int i = 0; i< n-1; i++) {
			for(int j =  i + 1; j< n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i< n ; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
