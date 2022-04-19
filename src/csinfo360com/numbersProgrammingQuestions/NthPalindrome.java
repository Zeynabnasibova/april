package csinfo360com.numbersProgrammingQuestions;

public class NthPalindrome {
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 300;
        int count = 0;
        int n = 15;
        for(int i = num1; i <= num2; i++){
            if(isPalindrome(i)){
                count++;

                if (count == n){
                    System.out.println(i + " ");
                }

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
