package com.leetcodepractice;

import java.util.Stack;

public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a."));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));

    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[, : . @ # -- ? ;]\", \"\" ``]", "");
        System.out.println("String is: " + str);
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.empty()) {
            result += stack.pop();
        }
        System.out.println("Reverse is: " + result);
        if (str.equalsIgnoreCase(result)) {
            return true;
        } else {
            return false;
        }
    }
}
