package com.leetcodepractice;

public class LongestCommonPrefix {

    private static String longestComPref(String[] listofStrings) {
        if (listofStrings.length == 0) {
            return "";
        }
        String shortestWord = listofStrings[0];
        String none = "";
        int lengthOfShortestWord = shortestWord.length();
        for (String str : listofStrings) {
            if (str.length() < lengthOfShortestWord) {
                shortestWord = str;
                lengthOfShortestWord = shortestWord.length();
            }
        }
        int i = 0;
        while (i < lengthOfShortestWord) {
            for (String str : listofStrings) {
                System.out.println("Testing for: " + shortestWord.charAt(i));
                if (str.charAt(i) != shortestWord.charAt(i)) {
                    return shortestWord.substring(0, i);
                }
            }

            i++;
        }

        return shortestWord.length() >= 1 ? shortestWord : " ";
    }

    public static void main(String[] args) {
        //String[] listofStrings1 = {"aflowat", "bflow", "cflower", "dflowppy"};
        String[] listofStrings2 = {"flowat", "flowy", "flower", "flowppy"};
        //System.out.println(longestComPref(listofStrings1));
        System.out.println(longestComPref(listofStrings2));
    }


}
