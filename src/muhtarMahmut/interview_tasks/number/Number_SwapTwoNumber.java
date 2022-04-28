package muhtarMahmut.interview_tasks.number;

import java.util.Scanner;

public class Number_SwapTwoNumber {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();//int num1 = 3;
        System.out.println("Enter your second number");
        int num2 = input.nextInt();//int num2 = 2;

        num1 = num1 + num2;//3 + 2 = 5
        num2 = num1 - num2;//5 - 2 = 3
        num1 = num1 - num2;//5 - 3 = 2


        System.out.println("After swaping num1 = " + num1 + "\nAfter swapping num2 = " + num2);
    }

}
