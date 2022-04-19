package csinfo360com.numbersProgrammingQuestions;

public class ArmstrongInRange {
    /*
      Find out all Armstrong numbers present within a given range
       */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 370;
        for(int i = num1; i <= num2; i++){
            if(isArmstromg(i)){
                System.out.print(i + " ");
            }
        }

    }
    public static boolean isArmstromg(int num ){
        int temp = num;
        //int num 153 kub each digit 1 kub + 5 kub + 3 kub
        int contayner = 0;
        while(num != 0){
            int remainder = num % 10;
            contayner += remainder * remainder * remainder;
            num = num / 10;
        }
        if (contayner == temp){
            return true;
        }else{
            return false;
        }
    }

}
