package csinfo360com.Crackingthecodinginterview.step4;

public class PrimeNumberInRange {
    //2 3 5 7 11 13
    public static void main(String[] args) {
        //System.out.println(isPrime3(3));
        int nTh = 13;
        int count = 0;
        for(int i = 2; i <= 20; i++){
            if(isPrime3(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime3(int num){
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
