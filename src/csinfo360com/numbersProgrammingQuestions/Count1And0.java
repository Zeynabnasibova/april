package csinfo360com.numbersProgrammingQuestions;

import java.util.Scanner;

public class Count1And0 {
    /*
    Find out how many 1 and 0 in a given number.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        count1And0(number);

    }

    public static void count1And0(int num) {

        int count1 = 0;
        int count0 = 0;

        while (num != 0) {

            int remainder = num % 10;
            if (remainder == 1) {
                count1++;
            } else if (remainder == 0) {
                count0++;
            }
            num = num / 10;
        }
        System.out.println(count0);
        System.out.println(count1);
    }
}
