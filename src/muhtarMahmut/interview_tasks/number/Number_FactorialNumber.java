package muhtarMahmut.interview_tasks.number;

public class Number_FactorialNumber {

    /*
    Write a return method that returns the factorial number of any given number
        Ex:
                Input: 5
                outPut: 120
                because 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {
    int number = 5;
 int factorial = 1;

    for(int i = 1; i <= number; i++){
        factorial = factorial * i;
    }
        System.out.println(factorial);
    }
}
