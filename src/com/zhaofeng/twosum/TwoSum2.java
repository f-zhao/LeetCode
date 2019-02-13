package com.zhaofeng.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaofeng
 * @version 1.0
 * @date 2019年02月13日 17:50
 * @description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 算法时间复杂度O(1)
 */
public class TwoSum2 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            if (map.containsKey(anotherNum) && map.get(anotherNum) != i) {
                return new int[]{i, map.get(anotherNum)};
            }
        }
        throw new IllegalArgumentException("not found");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target).toString());
    }
}
