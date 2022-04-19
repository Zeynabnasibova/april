package csinfo360com.Airbnbcodingquestions;
import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {
    /*
    1. Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.

Example:
Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
Output: [6,8]

Input: A = [100, 150, 150, 153], target = 150
Output: [1,2]

Input: A = [1,2,3,4,5,6,10], target = 9
Output: [-1, -1]
     */
    public static void main(String[] args) {
        int[] arr = new int []{1,4};
        int target = 4;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
       // int[] arr = {1, 3, 3, 5, 7, 8, 9, 9, 9, 15};
       // int target = 9;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
                if (nums[i] == target) {
                    list.add(i);
                }
            }
         //   System.out.println(list);
        int [] newArr = new int [2];
        if(list.size()== 0){
            newArr[0] = -1;
            newArr[1] = -1;
        //    return newArr;
          //  System.out.println(-1);
        }else if(list.size()==1){
           newArr[0] = list.get(0);
           newArr[1] = list.get(0);
        }else{
            newArr[0] = list.get(0);
            newArr[1] = list.get(list.size()-1);
        }
       return newArr;
        }
    }

