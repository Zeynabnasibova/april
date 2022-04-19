package csinfo360com.Crackingthecodinginterview.step3;

public class PrimeNumber {
    //2 3 5 7 11 13
    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
    public static boolean isPrime(int num){
        int count = 0;
        if (num == 1){
            return false;
        }else{
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
        }
        if(count == 2){
            return  true;
        }else{
            return false;
        }
    }
}
