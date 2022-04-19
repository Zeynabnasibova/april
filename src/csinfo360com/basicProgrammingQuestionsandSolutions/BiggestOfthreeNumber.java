package csinfo360com.basicProgrammingQuestionsandSolutions;

public class BiggestOfthreeNumber {
    /*
     Program to Find the Biggest of three numbers
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println(max(num1,num2,num3));
    }
    public static int max(int num1 ,int num2, int num3){
        int max = Integer.MIN_VALUE;
        if(num1 > num2 && num1 > num3){
            max = num1;
        }else if(num2 > num1 & num2 > num3){
            max = num2;
        }else {
            max = num3;
        }
        return max;
    }

}
