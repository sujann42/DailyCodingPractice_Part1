package com.leetcodepractice;

public class ReversingAString {
    public static String recursiveMethod(String str) {
        {
            String result="";
            if ((null == str) || (str.length() <= 1)) {
                return str;
            }
            result = recursiveMethod(str.substring(1)) + str.charAt(0);
            return result;
        }
    }
}
