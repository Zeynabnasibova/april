package tutorialgateway.basic;

public class PrintNumbersWithoutLoop {
    public static void main(String[] args) {
        int number = 1;
        printNumbers(number);
    }
    public static void printNumbers(int number){
        if(number <= 100){
            System.out.print(number + " ");
        printNumbers(number + 1);
        }
    }
}
