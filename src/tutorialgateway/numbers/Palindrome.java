package tutorialgateway.numbers;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
    public static boolean palindrome(int num){
        int temp = num;

        int reverse = 0;
        while (num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;

        }
        if (temp == reverse){
            return true;
        }else{
            return false;
        }
    }

}


