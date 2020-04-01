package com.leetcodepractice;

public class FindNeedleInHayStack {

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        } else if (haystack == null || needle == null) {
            return -1;
        } else if (haystack.length() == needle.length()) {
            if (haystack.equals(needle)) {
                return 0;
            } else {
                return -1;
            }
        }
        int beginIndexofNeedle = needle.charAt(0);
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == beginIndexofNeedle && haystack.substring(i, i + needle.length()).equals(needle) ) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "p"));
    }
}
