package leetcodeCom;

public class MissingNumber268 {
    public static void main(String[] args) {
        int [] nums = {3,0,1,4,5};//2
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;//13
        int expected = (1 + nums.length) * nums.length / 2;//6 * 5 / 2 = 15
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
        }
        return expected - sum;
    }
}