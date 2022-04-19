package csinfo360com.pattern;

import java.util.Scanner;

public class InvertedRigthTriangleStarPatern {
    /*
    Program to print inverted right triangle star pattern
     *****
     ****
     ***
     **
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size");
        int rowSize = input.nextInt();

        for (int i = rowSize; i > 0; i-- ) {
            for (int j = 0 ; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}