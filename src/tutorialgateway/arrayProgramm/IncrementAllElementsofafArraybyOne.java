package tutorialgateway.arrayProgramm;

import java.util.Arrays;

public class IncrementAllElementsofafArraybyOne {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5,6};

        for(int i = 0; i < arr.length;i++){
            arr[i] = arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
