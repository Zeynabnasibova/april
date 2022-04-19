package leetcodeCom;

public class AddDigits258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits ( int num) {
        int temp = num;
        while (num > 9) {
            int sum =0;
            while (num != 0) {
                int remainder = num % 10;
                sum += remainder;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
/*
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
 */