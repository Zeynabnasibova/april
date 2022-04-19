package tutorialgateway.numbers;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
    public static boolean isPrime(int num){
        int count = 0;
        if(num <= 1) {
            return false;
        }else{

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
