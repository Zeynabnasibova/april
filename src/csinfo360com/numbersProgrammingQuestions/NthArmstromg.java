package csinfo360com.numbersProgrammingQuestions;

public class NthArmstromg {
    /*
Program to Find nth Armstrong Number

    A Number is an Armstrong Number if the sum of cubes of digits of the number is equal to Given Number.

Example:

               Given Number=370
               sum of cubes of digits=3³+7³+0³=27+343+0=370


Problem statement:-  Program to Find nth Armstrong Number.
     */
    public static void main(String[] args) {

        int conteyner = 0;
        int n = 154 ;
        int count = 0;

        for(int i = 0; i <= n; i++) {
            int temp = i;

            while (i != 0) {
                int remainder = i % 10;
                conteyner = conteyner + (remainder * remainder * remainder);
                i = i / 10;
            }
            if(conteyner == temp){
                System.out.println(conteyner);
                count++;
            }
        }
    }
}