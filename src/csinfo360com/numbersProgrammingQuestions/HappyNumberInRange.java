package csinfo360com.numbersProgrammingQuestions;

public class HappyNumberInRange {
    /*
      Find out all Happy numbers present within a given range
       */
    public static void main(String[] args) {
        int num = 7;
        int result = num;
        while (result != 1 && result != 4){
            result = isHappyNum(result);
        }
        if( result == 1){
            System.out.println("hapy number");
        }else{
            System.out.println("Not Happy number");
        }
    }
    public static int isHappyNum (int num ){

        //int num = 10 -> 1 kv + 0 kv = 1 --> happy
        int container = 0;
        while(num != 0){
            int remainder = num % 10 ;
            container += remainder * remainder;
            num = num / 10;
        }
        return container;
    }

}
