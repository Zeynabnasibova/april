package csinfo360com.pattern;
import java.util.Scanner;
public class RightTriangleStarPattern {
    /*
    Program to print right triangle star pattern
  *
  **
  ***
  ****
  *****
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size");
        int rowSize = input.nextInt();
        for (int out = 0; out < rowSize; out++) {// 0  0 -> 1
            for (int in = 0; in <= out; in++){// 0 <= 0   0 <= 1 -> 1 <= 0 , 1 <= 1
                System.out.print("*");
            }
            System.out.println();

        }
    }

}