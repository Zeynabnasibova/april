package csinfo360com.pattern;

import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row size");
        int rowSize = input.nextInt();

        for(int out = 0; out < rowSize; out++) {
            for(int in = 0; in < rowSize;  in++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}