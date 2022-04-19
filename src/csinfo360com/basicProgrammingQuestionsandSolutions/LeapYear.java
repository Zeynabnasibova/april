package csinfo360com.basicProgrammingQuestionsandSolutions;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2050;
  if(year % 100 != 0 && year % 4 == 0  || year % 400 == 0){
      System.out.println("Leap Year");
  }else{
      System.out.println("Not leap year");
  }
    }
}
