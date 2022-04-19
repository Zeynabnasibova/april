package tutorialgateway.arrayProgramm;

import java.util.Arrays;

public class ReversearrayuseSwap {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4,5};
        for (int i = 0; i < arr.length / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[arr.length - i- 1];
            arr[arr.length  - i -1 ] = swap;

        }
//        arr[0] = arr[arr.length-1];
       System.out.println(Arrays.toString(arr));



    }
}
