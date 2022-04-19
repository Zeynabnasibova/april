package tutorialgateway.basic;

import java.util.Scanner;

public class Percentage {
    /*
    Java program to find Total Average and Percentage of Five Subjects
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first subject");
        int sub1 = input.nextInt();

        System.out.println("Enter your second subject");
        int sub2 = input.nextInt();

        System.out.println("Enter your third subject");
        int sub3 = input.nextInt();

        System.out.println("Enter your fourth subject");
        int sub4 = input.nextInt();

        System.out.println("Enter your fifth subject");
        int sub5 = input.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        int average = total / 5;
        int percentage = (total / 500 )* 100;

    }
}
