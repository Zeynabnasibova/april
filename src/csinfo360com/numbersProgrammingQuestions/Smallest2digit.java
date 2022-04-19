package csinfo360com.numbersProgrammingQuestions;

public class Smallest2digit {
    /*
    Find 2nd smallest digit in a given number

     */
    public static void main(String[] args) {
      int num = 54678;

      int min = Integer.MAX_VALUE;
int secondMin = Integer.MAX_VALUE;
      while(num != 0){

          int remainder = num % 10;
          if(remainder < min){
              min = remainder;
          }else if(remainder < secondMin){
              secondMin = remainder;
          }
          num = num / 10;
      }
        System.out.println(min);
        System.out.println(secondMin);

    }
}

