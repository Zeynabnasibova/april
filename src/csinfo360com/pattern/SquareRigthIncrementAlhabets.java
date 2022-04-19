package csinfo360com.pattern;

import java.util.Scanner;

public class SquareRigthIncrementAlhabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row size");
        int rowSize = input.nextInt();
        System.out.println("Square of Right Incremented Alphabets Pattern");
        int alphabet = 65;
        for (int i = 0; i <= rowSize - 1; i++ ) {
            for (int j = rowSize - 1; j > i; j-- ) {
                System.out.print("A ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print((char)(alphabet + i) + " ");
            }
            System.out.println();
        }
    }
}