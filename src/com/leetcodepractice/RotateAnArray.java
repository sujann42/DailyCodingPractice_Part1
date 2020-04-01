package com.leetcodepractice;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);

        /*Input: [1,2,3,4,5,6,7] and k = 3
        Output: [5,6,7,1,2,3,4]
        ++++++++++++++++++++++++++++++++++
        Input: [-1,-100,3,99] and k = 2
        Output: [3,99,-1,-100]*/
    }

    public static void rotate(int[] nums, int k) {

        for (int n = 0; n < k; n++) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }


        printArr(nums);
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

}
