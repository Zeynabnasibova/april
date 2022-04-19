package csinfo360com.numbersProgrammingQuestions;

public class PalindromeInRange {
    /*
       Find out all palindrome numbers present within a given range.
        */
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 300;

        for(int i = num1; i <= num2; i++){
            if(isPalindrome(i)){

                System.out.print(i + " ");

            }
        }

    }

    public static boolean isPalindrome(int num){
        int temp = num;
        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if(temp == reverse){
            return true;
        }else{
            return false;
        }
    }
}
