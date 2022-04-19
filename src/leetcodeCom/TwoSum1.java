package leetcodeCom;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum1 {
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
        int [] nums = {3,2,3} ;
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        //int [] nums = {3,2,3}
        //int target = 6
        //output: [0,1]
        ArrayList<Integer> list = new ArrayList <>();
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i +1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int [] newArr = new int [2];
        newArr[0] = list.get(0);
        newArr[1] = list.get(1);
        return newArr;
    }

}
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] == target - nums[i]) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return null;
//     }
// }