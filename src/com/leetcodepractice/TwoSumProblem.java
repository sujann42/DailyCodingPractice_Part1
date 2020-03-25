package com.leetcodepractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public int[] twoSum(int[] arr, int target) {
        int[] resultArr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                }
            }
        }
        return resultArr;
    }

    public static int[] twoNumSumUingMap(int[] arr, int target) {
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int next = target - arr[i];
            if (mapp.containsKey(next)) {
                return new int[]{mapp.get(next), i};
            }
            mapp.put(arr[i], i);
        }
        throw new IllegalArgumentException("Pairs Not Found");
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 20, 10};
        int target = 30;
        TwoSumProblem tsp = new TwoSumProblem();
        System.out.println(Arrays.toString(tsp.twoSum(arr, 19)));
        System.out.println(Arrays.toString(twoNumSumUingMap(arr, target)));


    }

}
