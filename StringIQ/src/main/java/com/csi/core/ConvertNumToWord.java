package com.csi.core;

/*Print a given number in words (max 4 digit)
100 : one hundred
1221: one thousand two hundred twenty one*/

public class ConvertNumToWord {

	private static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	public static void main(String[] args) {

		int num = 4563;

		String result = "";
		int thousands = num / 1000;
		if (thousands > 0) {
			result += ones[thousands] + " thousand ";
			num %= 1000;
		}
		int hundreds = num / 100;
		if (hundreds > 0) {
			result += ones[hundreds] + " hundred ";
			num %= 100;
		}
		if (num > 0) {
			if (num < 20) {
				result += ones[num];
			} else {
				result += tens[num / 10] + " " + ones[num % 10];
			}
		}

		System.out.println(result);
	}
}
