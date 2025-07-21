package com.fancyString;

public class makeFancyString {

    public static void main(String[] args) {
        // Test cases
        System.out.println(makeFancy("leeetcode"));  // Output: "leetcode"
        System.out.println(makeFancy("aaabaaaa"));   // Output: "aabaa"
        System.out.println(makeFancy("aab"));        // Output: "aab"
        System.out.println(makeFancy("aaaa"));       // Output: "aa"
    }

 
    public static String makeFancy(String s) {
        if (s == null || s.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;
        char prev = s.charAt(0);
        result.append(prev);

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                prev = curr;
                count = 1;
            }

            if (count < 3) {
                result.append(curr);
            }
        }

        return result.toString();
    }
}
