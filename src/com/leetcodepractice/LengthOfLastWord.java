package com.leetcodepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String str1 = " a";
        String str2 = "a";
        String str3 = "a ";
        //String str2 = "Hellos Amigos";
        //System.out.println(lengthOfLastWordInString(str));
        //System.out.println(lengthOfLastWordInString(str1));
        //System.out.println(lengthOfLastWordInString(str2));
        String str = "Hey dis mew";
        System.out.println(lastWordLen(str1));
        System.out.println(lastWordLen(str2));
        System.out.println(lastWordLen(str3));
    }

    public static int lengthOfLastWordInString(String s) {
        if (s.length() <= 0) {
            return 0;
        } else {
            String[] words = s.split(" ");
            int lenOfArray = words.length;
            return words[lenOfArray - 1].length();
        }
    }

    public static int lastWordLen(String s) {
        String str= s.trim();
        if (str.length() <= 0 || str.isEmpty() || str.isBlank()) {
            return 0;
        }
        int count = 0;
        System.out.println("Length of str: " + str.length());
        System.out.println("String is: " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) != ' ' && i >= 0) {
                count++;

            } else {
                break;
            }

        }
        return count;
    }


}
