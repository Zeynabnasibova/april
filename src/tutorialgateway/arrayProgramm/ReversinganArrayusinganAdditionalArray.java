package tutorialgateway.arrayProgramm;

import java.util.Arrays;

public class ReversinganArrayusinganAdditionalArray {
    public static void main(String[] args) {
        int[] array = {7, 8, 9, 10, 11};
        System.out.println("Array : " + Arrays.toString(array)); // print array
        int [] reversed = new int [array.length];
for(int i = 0; i < array.length; i++){
    reversed[array.length -i - 1] = array[i];
}
        System.out.println(Arrays.toString (reversed));
    }
}
