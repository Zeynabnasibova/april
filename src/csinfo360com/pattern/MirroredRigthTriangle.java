package csinfo360com.pattern;

import java.util.Scanner;

public class MirroredRigthTriangle {

    /*
    Program to print mirrored right triangle star pattern
        *
      **
    ***
  ****
*****
     */

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter roe size");
        int rowSize = input.nextInt();


        for (int i = 1 ; i <= rowSize; i++ ) {
            for (int j = 0 ; j < rowSize - i; j++ ) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < i; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}