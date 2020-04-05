package com.leetcodepractice;

import java.util.*;

public class ThisFirstUniqueCharString {

    public static int getFirstUniqChar(String str) {
        Map<Character, Integer> mapp = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!mapp.containsKey(str.charAt(i))) {
                mapp.put(str.charAt(i), i);
            } else {
                mapp.put(str.charAt(i), -1);
            }

        }

        int index = Integer.MAX_VALUE;
        for (Character chars : mapp.keySet()) {
            if (mapp.get(chars) > -1 && map.get(chars) < index) {
                index = mapp.get(chars);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }

    public static void main(String[] args) {
        System.out.println(getFirstUniqChar("aabbccdeffgghh"));
    }
}
