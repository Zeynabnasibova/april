package csinfo360com.pattern;

import java.util.Scanner;

public class SquareNumberPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row size");
        int rowSize = input.nextInt();

        for(int i = 0; i < rowSize; i++) {
            for(int j = 0; j < rowSize; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}