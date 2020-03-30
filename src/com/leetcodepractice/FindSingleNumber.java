package com.leetcodepractice;

import java.util.Arrays;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {5, 6, 17, 3, 14, 2, 4, 5, 3, 17, 4, 1, 6, 1, 14, 2};
        System.out.println(singleNumber(arr));
        System.out.println(getSingleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;
    }

    public static int getSingleNumber(int[] nums) {
        int res = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return   nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
