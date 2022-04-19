package muhtarMahmut.interview_tasks.number;

public class Number_Fibonacci {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8

        int number = 8;
        int firstNum = 0;
        int secondNUm = 1;

        System.out.print(firstNum + " " + secondNUm + " ");

        for(int i = 2; i < number; i++){

          int  next = firstNum + secondNUm;

            System.out.print(next + " ");

            firstNum = secondNUm;
            secondNUm = next;

        }

    }
}
