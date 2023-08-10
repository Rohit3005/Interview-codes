package com.csi.core;

public class StringWordReverse {
	
	//Input: Java is language
	//OutPut: avaJ si egaugnal
	
    public static void main(String[] args) {
        String string = "Java is language";
        
        System.out.println(reverseWords(string));
        
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            char[] chars = word.toCharArray();
            int i = 0, j = chars.length - 1;
            while (i < j) {
                // Swap characters at i and j
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                // Move i and j closer to the center
                i++;
                j--;
            }
            sb.append(new String(chars)).append(" ");
        }
        return sb.toString().trim();
    }
}
