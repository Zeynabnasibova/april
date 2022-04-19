package tutorialgateway.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    //153 = 1kub + 5 kub + 3 kub = 153
public static void main(String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter your number");
    int number = input.nextInt();
    System.out.println(isArmstrong(number));
}

public static boolean isArmstrong(int number ){//153 --> 0

    int armstrong = 0;//153
    int temp = number; // =153 temp

    while(number != 0){
        int  remainder = number % 10;
        armstrong = armstrong + remainder * remainder * remainder;
        number = number / 10;
    }
    if( temp == armstrong){//153 == 153
        return true;
    }else{
        return false;
    }

}

}


