package csinfo360com.numbersProgrammingQuestions;

public class Palindrome {
    public static void main(String[] args) {
        int num = 7667;
        int temp = num;

        int reverse = 0;
        while(num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if(temp == reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
