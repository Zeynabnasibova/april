package csinfo360com.basicProgrammingQuestionsandSolutions;

public class Swap1 {
    /*
    Program to swap two numbers using third variable
     */
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = num1;//2
         num1 = num2;// 3
        num2 = num3; //2
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
