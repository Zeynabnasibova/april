package leetcodeCom;

import java.util.ArrayList;
import java.util.Arrays;

public class IncreasingOrderSearchTree897 {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
     */
    public static void main(String[] args) {

        int [] nums = {3,2,4} ;// 3 + 2 , 2 + 4

        int target = 6;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
         if(nums[i] + nums[i + 1] == target){
             list.add(nums[i]);
             list.add(nums[i + 1]);
         }
        }
        int [] newNUms = new int [2];
        newNUms[0] = list.get(0);
        newNUms[1] = list.get(1);
        System.out.println(Arrays.toString(newNUms));
    }

}
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
 */
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
 */