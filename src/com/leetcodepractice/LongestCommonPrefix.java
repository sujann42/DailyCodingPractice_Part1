package com.leetcodepractice;

public class LongestCommonPrefix {

    private static String longestComPref(String[] listofStrings) {
        //If the array has no strings then it should return ""
        if (listofStrings.length == 0) {
            return "";
        }
        //Finding the shortest word
        //Assigning the first word to be the shortest to find the shortest in the array
        String shortestWord = listofStrings[0];
        String none = "";
        int lengthOfShortestWord = shortestWord.length();
        //Assigning the shortest word to the variable that was declared earlier
        for (String str : listofStrings) {
            if (str.length() < lengthOfShortestWord) {
                shortestWord = str;
                lengthOfShortestWord = shortestWord.length();
            }
        }
        //Checking up to the length of the shortest word in the array. Max can be only till the length of the shortest word.
        int i = 0;
        while (i < lengthOfShortestWord) {
            for (String str : listofStrings) {
                
                //If character at i in the shortest word does not match on any of the words in the string return the substring
                // of the shortest word until that matches which is substring(0, i); Gives until 1 before i.
                if (str.charAt(i) != shortestWord.charAt(i)) {
                    return shortestWord.substring(0, i);
                }
            }

            i++;
        }
        //Returns prefix if exists else return "".
        return shortestWord.length() >= 1 ? shortestWord : " ";
    }

    public static void main(String[] args) {
        //String[] listofStrings1 = {"aflowat", "bflow", "cflower", "dflowppy"};
        String[] listofStrings2 = {"flowat", "flowy", "flower", "flowppy"};
        //System.out.println(longestComPref(listofStrings1));
        System.out.println(longestComPref(listofStrings2));
    }


}
