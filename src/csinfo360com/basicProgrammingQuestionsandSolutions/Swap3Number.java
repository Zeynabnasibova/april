package csinfo360com.basicProgrammingQuestionsandSolutions;

public class Swap3Number {
    /*
    Write a program to swap three numbers
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        num1 = num1 + num2 + num3;// 1 + 2 + 3 = 6
        num2 = num1 - num2 - num3; // 6 - 2 - 3 = 1
        num3 = num1 - num2 -num3; // 6 - 1 - 3 = 2
        num1 = num1 -num2 - num3; // 6 - 1 - 2 = 3
        System.out.println();
    }
}
