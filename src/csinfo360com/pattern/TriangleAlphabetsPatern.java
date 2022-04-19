package csinfo360com.pattern;

import java.util.Scanner;

public class TriangleAlphabetsPatern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row size");
        int rowSize = input.nextInt();
        System.out.println("Printing Triangle Character/Alphabets Pattern");

        for (int i = 0 ; i < rowSize; i++ ) {
            int alphabet = 65;
            for (int j = rowSize ; j > i; j-- ) {
                System.out.print(" ");
            }
            for (int k = 0 ; k <= i; k++ )
            {
                System.out.print((char)(alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}