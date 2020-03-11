package com.qjm.util;

import java.util.*;

/**
 * @program: 类功能
 * @description: 类描述
 * @author: qianjianmei
 * @since: 2020/2/27
 **/
public class Test3 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<List<Integer>>();

        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            numList.add(new Integer(nums[i]));
        }
        Set<Integer> numSet = new HashSet<Integer>(numList);

        for (Integer num : numSet) {
            List<Integer> numList2 = new ArrayList<Integer>(numList);
            numList2.remove(num);
            Set<Integer> numSet2 = new HashSet<Integer>(numList2);
            for (Integer num2 : numSet2) {
                List<Integer> numList3 = new ArrayList<Integer>(numList2);
                numList3.remove(num2);
                if (numList3.contains(0 - num.intValue() - num2.intValue())) {
                    List<Integer> sublist = new ArrayList<Integer>();
                    sublist.add(num);
                    sublist.add(num2);
                    sublist.add(0 - num.intValue() - num2.intValue());
                    Collections.sort(sublist);
                    set.add(sublist);
                }

            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
