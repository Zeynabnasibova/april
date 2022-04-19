package csinfo360com.Crackingthecodinginterview.step2;

public class Q1 {
    /*

Question 1:


Is N an exact multiple of M?

Write a function that accepts two parameters and finds whether the first parameter is an
exact multiple of the second parameter. If the first parameter is an exact multiple of the
second parameter, the function should return 2 else it should return 1. If either of the
parameters is zero, the function should return 3.

Assumption: Within the scope of this question, assume that -

- the first parameter can be positive, negative or zero
- the second parameter will always be >=0
     */
    public static void main(String[] args) {
        System.out.println(exactMultiple(1,2));
    }
    public static int exactMultiple(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return  3;
        }if(num1 % num2 == 0){
            return  2;
        }else{
            return 1;
        }
    }
}
