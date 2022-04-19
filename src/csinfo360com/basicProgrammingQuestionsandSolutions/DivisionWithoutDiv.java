package csinfo360com.basicProgrammingQuestionsandSolutions;

public class DivisionWithoutDiv {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 4;
division(num1 ,num2);
    }
    public static void division(int num1, int num2){
        /*
        int num1 = 6; , 3
        int num2 = 3;
          6 / 3 = 2
         */
        int answear = 0;
        while (num1 >= num2){
            num1 = num1 - num2;// 6 - 3 = 3, 3 = 3 - 3 =0
            answear++;
        }
        System.out.println(num1 + " / " + num2+ " = " + answear);
        System.out.println("remainder = " + num1);
    }

}
