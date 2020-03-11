package com.qjm.util;

import java.util.*;

/**
 * @program: 类功能
 * @description: 类描述
 * @author: qianjianmei
 * @since: 2020/2/27
 **/
public class Test2 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //System.out.println(threeSum(nums));
        /*[1,1,1],
        [1,0,1],
        [1,1,1]*/

        int[][] data = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int row_max = data.length;
        int column_max = data[0].length;
        for (int x = 0; x < row_max; x++) {
            for (int y = 0; y < column_max; y++) {
                if (data[x][y] == 0) {
                    for (int m = 0; m < column_max; m++) {
                        data[x][m] = 0;
                    }
                    for (int n = 0; n < row_max; n++) {
                        data[n][y] = 0;
                    }

                }
            }
        }
        for (int i = 0; i < data[0].length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] != nums[i + 1]) {//去重
                for (int j = 0; j < nums.length; j++) {
                    if (j < nums.length - 1 && nums[j] != nums[j + 1]) {//去重
                        if (i != j) {
                            for (int k = 0; k < nums.length; k++) {
                                if (j != k && i != k) {
                                    if (nums[i] + nums[j] == -nums[k]) {
                                        //set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return new ArrayList<List<Integer>>(set);
    }
}
