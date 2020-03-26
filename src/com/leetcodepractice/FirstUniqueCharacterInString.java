package com.leetcodepractice;

import java.util.*;

public class FirstUniqueCharacterInString {

    public static int firstUniqueChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            } else {
                map.put(str.charAt(i), -1);
            }

        }

        int index = Integer.MAX_VALUE;
        for (Character chars : map.keySet()) {
            if (map.get(chars) > -1 && map.get(chars) < index) {
                index = map.get(chars);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("bbpxloveleetcpode"));
    }
}
