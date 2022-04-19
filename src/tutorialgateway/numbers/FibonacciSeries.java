package tutorialgateway.numbers;

import java.util.Scanner;

public class FibonacciSeries {
    //0 1 1 2 3 5 -> 1 + 2 = 3
    //                2 + 3 = 5
    //                3 + 5 = 8

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        fibonacci(number);
    }

    public static void fibonacci(int number) {
        int first = 0;
        int second = 1;
        int next = 0;
        System.out.print(first + " " + second );//printing 0 and 1
            for (int i = 2; i <= number; i++) {//2  3
                next = first + second;//0 + 1 = 1 , 1 + 1 = 2
                System.out.print(" " + next);//1 , 2
                first = second;//first = 1 , 1
                second = next;//second = 1, 2
        }
    }
}