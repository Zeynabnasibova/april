package csinfo360com.numbersProgrammingQuestions;

public class PrimeInRange {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        for(int i = num1; i <= num2; i++){
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPalindrome(int num){

        if(num <= 1){
            return false;
        }else{
            int count =0;
            for(int i = 2; i <= num; i++){
                if( num % i == 0){
                    count++;
                }
            }
            if ( count == 1){
                return  true;
            }else{
                return false;
            }
        }
    }

}
