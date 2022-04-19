package csinfo360com.basicProgrammingQuestionsandSolutions;

public class MulipicationTable {
    public static void main(String[] args) {
int num = 2;
        multipltable(num);
    }
    public static void multipltable(int num){
        System.out.println("Multiplication table of number " + num + ":");
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " * " + num + " = " + (i * num));
        }
    }
}
