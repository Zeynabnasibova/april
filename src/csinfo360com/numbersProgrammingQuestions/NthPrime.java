package csinfo360com.numbersProgrammingQuestions;

public class NthPrime {
    public static void main(String[] args) {
/*
Write a Program to Find the nth Prime Number
 */
        int num1 = 2;
        int num2 = 13;
        int nth = 3;
        int count = 0;
        for(int i = num1; i <= num2; i++){
            if(isPrime(i)){
                count++;
                if(count == nth){
                    System.out.println(i);
                }
            }
        }


    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }else{
            int count =0;
            for(int i = 2; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }else{
                return false;
            }
        }

    }
}
