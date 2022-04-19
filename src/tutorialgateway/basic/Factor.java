package tutorialgateway.basic;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        /*
        how many factors have given number
        and print this numbers
         */
        //30 / 1
        // 30 / 2 = 15
        //30 / 15 = 2
        //30 / 30
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
                System.out.println(i + " ");
            }
        }
        System.out.println("Number " + number + " has " + count + " factors");
    }
}
