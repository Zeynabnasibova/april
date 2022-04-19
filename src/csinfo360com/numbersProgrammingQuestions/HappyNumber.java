package csinfo360com.numbersProgrammingQuestions;

public class HappyNumber {
    /*
    Check whether number is Happy Number or Not
    Natural Number:- Replace the Number by the sum of the squares of its digits, and repeat the process. In the end, If the Number is equaled to 1 then it is a Happy Number.

Example:-

 Given Number=31

               31⇒3²+1²=10
               10⇒1²+0²=1
               31 is Happy Number.

                Given Number=11
               11⇒1²+1²=2
                2⇒2²=4
               11 is an Unhappy Number.
               an unhappy number resulting 4, 16, 37, 58, 89, 145, 42, 20,.....

Some Happy numbers are 7, 28, 100, 320 etc.


     */
    public static void main(String[] args) {
        int num  = 28;
        int result = num;
        while (result != 1 && result != 4){
            result = isHappyNum(result);
        }
        if(result == 1){
            System.out.println("Happy number");
        }else{
            System.out.println("Not hapy number");
        }
    }
    public static int isHappyNum(int num ){

        int contayner = 0;
        while (num != 0){
            int remainder = num % 10;
            contayner += remainder * remainder;
            num = num / 10;
        }
        return  contayner;
    }
}
