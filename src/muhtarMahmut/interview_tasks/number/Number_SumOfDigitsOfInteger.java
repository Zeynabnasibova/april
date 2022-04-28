package muhtarMahmut.interview_tasks.number;

public class Number_SumOfDigitsOfInteger {

    public static void main(String[] args) {

        int num = 123;//1+ 2 + 3 = 6

        int sumOfDigits = 0;

        while(num > 0){

            int remainder = num % 10;// 123 % 10 = 3
            sumOfDigits += remainder;
            num = num / 10;

        }

        System.out.println("Sum of digits = " + sumOfDigits);

    }

}
