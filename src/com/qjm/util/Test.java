package com.qjm.util;

/**
 * @program: 类功能
 * @description: 类描述
 * @author: qianjianmei
 * @since: 2020/3/11
 **/
public class Test {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        String result = run(nums, target);
        System.out.println(result);

    }

    private static String run(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return i + "," + j;
                }
            }
        }
        return null;
    }
}
