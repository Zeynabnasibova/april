package csinfo360com.basicProgrammingQuestionsandSolutions;

public class Swap2Number {
    /*
    Program to swap two numbers without third variable
     */
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        num1 = num1 + num2;// 2 + 3 = 5
        num2 = num1 - num2;// 5 - 3 = 2
        num1 = num1 - num2; // 5 - 2 = 3
        System.out.println("num1 = " + num1);
        System.out.println("num2  = " + num2);

    }
}
