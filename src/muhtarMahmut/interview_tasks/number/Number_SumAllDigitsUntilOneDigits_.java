package muhtarMahmut.interview_tasks.number;

public class Number_SumAllDigitsUntilOneDigits_ {

    public static void main(String[] args) {
        int num = 12345;// 1 + 2 + 3 + 4 + 5 = 15 = 1 + 5 = 6
        int sumOfDigits = 0;//15 = 1 + 5 = 6

        while (num > 10) {
            sumOfDigits = 0;
            while (num > 0) {
                int remainder = num % 10;
                sumOfDigits += remainder;
                num = num / 10;
            }
            num = sumOfDigits;
        }
        System.out.println(sumOfDigits);
    }

}