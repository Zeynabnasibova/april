package tutorialgateway.numbers;
import java.util.Scanner;
public class ReverseANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();
     //   System.out.println(reverse(number));
        ReverseANumber obj  = new ReverseANumber();
        System.out.println(obj.reverse(number));

    }
    public int reverse(int number){//int number = 123 -> 12 ->
       int reverse = 0;// conteyner 3 , 32

        while( number != 0){
            int remainder = number % 10;// 123 % 10 = 3 , 12 % 10 = 2, 1 % 10 = 1
            reverse = reverse * 10 + remainder;//0 * 10 + 3 = 3,  3 * 10 + 2 =32, 32 * 10 + 1 = 321

            number = number / 10;//123 / 10 = 12,  12 / 10 = 1 , 1 / 10 = 0
        }
        return reverse;
    }

}
