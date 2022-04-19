package csinfo360com.Crackingthecodinginterview.step10;

public class SumofSumsofDigitsinCyclicorder {
    public static void main(String[] args) {

        int num = 582109;
        int temp = num;//582109
        int sum = 0;
        while (temp > 9) {
            temp = temp / 10;//58210
            while (num != 0) {
                int remainder = num % 10;
                sum = sum + remainder;
                num = num / 10;
            }
            num = temp;
        }
        System.out.println(sum);

    }
}