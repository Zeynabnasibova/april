package csinfo360com.numbersProgrammingQuestions;
import java.util.Scanner;
public class NthHappyNumber {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

        int num = 1;
        int count = 0;
        int letest = 0;
        System.out.println("Enter Nth number:");
       int rangenumber=cs.nextInt();

        while (count != rangenumber) {
            int num2 = num;
            int num1 = num;
            int sum = 0;

            while (num1 != 0) {
                int rem = num1 % 10;
                num1 = num1 / 10;
                sum = sum + rem * rem * rem;
            }
            if (sum == num2) {
                count++;
                letest = num;
            }
            num++;
        }
        System.out.println(rangenumber+"th amstrong number is "+letest);

    }
}