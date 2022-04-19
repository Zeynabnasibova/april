package leetcodeCom;

public class ThirdMaximumNumber414 {

    public static void main(String[] args) {
        int [] nums = {1,2};
        System.out.println(thirdMax(nums));

    }

    public static int thirdMax(int[] nums) {

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] == firstMax) {
                continue;
            } else if (nums[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] == secondMax){
                continue;
        } else if(nums[i] > thirdMax){
                thirdMax = nums[i];
            }
        }

        return thirdMax == Long.MIN_VALUE ? (int)firstMax : (int)thirdMax;

    }
}