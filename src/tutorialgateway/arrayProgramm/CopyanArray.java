package tutorialgateway.arrayProgramm;
import java.util.Arrays;
import  java.util.Scanner;
public class CopyanArray {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your array size");
        int arrLength = input.nextInt();

        int [] arr = new int [arrLength];

        for(int i = 0; i < arrLength; i++){
            System.out.println("Enter your number at position " + i);
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));


        int [] copyArr = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
           copyArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(copyArr));
    }

}
