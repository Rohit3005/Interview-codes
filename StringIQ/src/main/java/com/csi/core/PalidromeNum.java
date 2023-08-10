package com.csi.core;

public class PalidromeNum {
	
	public static void main(String[] args) {
		int r, sum = 0;
		int n = 545;
		int temp =545;
		while(n>0) {
			r = n %10;
			sum = (sum*10)+ r;
			n = n /10;
		}
		if(temp == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
