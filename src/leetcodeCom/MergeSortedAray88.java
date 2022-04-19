package leetcodeCom;

import java.util.Arrays;

public class MergeSortedAray88 {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2={2,5,6};
        int n = 3;
        //1,2,3,0,0,0
        //2,5,6

        int [] mergedArr = new int [nums1.length];
        int count = 0;
        for(int i = 0; i< m; i++){
            mergedArr[i] = nums1[i];
            count++;
        }
//        System.out.println(count);
//        System.out.println(Arrays.toString(mergedArr));

        for(int i = 0; i < nums2.length; i++){
            mergedArr[i + count] = nums2[i];

        }
        Arrays.sort(mergedArr);
        nums1 = mergedArr;
        System.out.println(Arrays.toString(nums1));
    }
}
