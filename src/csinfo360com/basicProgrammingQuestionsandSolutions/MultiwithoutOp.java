package csinfo360com.basicProgrammingQuestionsandSolutions;

public class MultiwithoutOp {
/*
Multiply two numbers without using multiplication(*) operator
 */
    public static void main(String[] args) {

    }
    public static int multi(int num1, int num2){
//int num1 = 2;
        // int num2 = 3;
        int sum = 0;//3, 6
     for(int i = 1; i <= num1; i++){
         sum = sum + num2;//0 + 3= 3 , 3 + 3 = 6
     }
        return sum;
    }
}
