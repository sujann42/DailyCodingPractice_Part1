package com.leetcodepractice;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        int l = s.length();
        if (l % 2 != 0) {
            return false;
        }
        char[] charArr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char cc : charArr) {
            if (!st.isEmpty()) {
                char top = st.peek();
                if ((cc == ')' && top == '(') || (cc == ']' && top == '[') || (cc == '}' && top == '{')) {
                    st.pop();
                } else {
                    st.push(cc);
                }
            } else {
                st.push(cc);

            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validityTest(String s){
        Stack<Character> st = new Stack<>();
        char[] charArray = s.toCharArray();
        for(Character cc: charArray){
            if(st.isEmpty()){
                st.push(cc);
            }else{
                int topOfStack = st.peek();
                if((cc == ']' && topOfStack == '[') || (cc == '}' && topOfStack == '{') || (cc == ')' &&topOfStack == '(')){
                    st.pop();
                }else{
                    st.push(cc);
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "(())[]";
        //System.out.println(isValid(str));
        System.out.println(validityTest(str));
    }
}
