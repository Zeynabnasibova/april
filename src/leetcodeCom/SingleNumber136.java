package leetcodeCom;

public class SingleNumber136 {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int singleOne =0;
        for(int i = 0; i < nums.length; i++){
            //2
            //2 2 1

            //2
            //2 2 1

            //1
            //2 2 1
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            if(count == 1){
                singleOne = nums[i];
            }

        }

        return singleOne;

    }
}