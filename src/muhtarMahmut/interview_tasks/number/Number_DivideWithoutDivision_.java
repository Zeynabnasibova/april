package muhtarMahmut.interview_tasks.number;

public class Number_DivideWithoutDivision_ {
    public static void main(String[] args) {
         /*
    Write a method that can divide two numbers without using division operator
     */
      div(14,3);
    }
    public static void div(int number1,int number2 ){
       // int number1 = 14;// 1
    //    int number2 = 3;
        int count = 0;

        while(number1 >= number2){//
            number1 = number1 - number2;//7 - 3 = 4, 4 -3 = 1
            count++;//2

        }
        int div = count;
        int remainder = number1;//1
        System.out.println(div);
        System.out.println(remainder);
    }
}
