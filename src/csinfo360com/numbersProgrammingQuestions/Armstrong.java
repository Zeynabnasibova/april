package csinfo360com.numbersProgrammingQuestions;

public class Armstrong {
    /*
    Check a given number is an Armstrong Number
    Sample Input First: 250                         Sample Output First: It is not an Armstrong Number
Sample Input Second: 153                    Sample Output Second: It is an Armstrong Number
     */
    public static void main(String[] args) {
        System.out.println(armstrongNUm(153));
    }

    public static boolean armstrongNUm(int num) {//int num 153 = 1 kub + 5 kub + 3 kub = 153
        int temp = num;
        int conteyner = 0;
        while (num != 0) {
            int remainder = num % 10;
            conteyner = conteyner + (remainder * remainder * remainder);
            num = num / 10;

        }
        if (temp == conteyner) {
            return true;
        } else {
            return false;
        }

    }
}