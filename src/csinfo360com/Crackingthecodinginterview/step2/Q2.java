package csinfo360com.Crackingthecodinginterview.step2;

public class Q2 {
    /*
    Question 2:


Of the given 5 numbers, How many are even?

Write a function that accepts 5 input parameters and returns the count of how many those 5
are even.
For example,
If the five input parameters are 12, 17, 19, 14, and 115, there are two even numbers 12  and
14. So, the function must return 2.

Similarly,
If the five input parameters are 15, 0, -12, 19, and 28, there are three even numbers 0, -12,
and 28. So, the function must return 3.Observe that zero is also considered an even number.

     */
    public static void main(String[] args) {
        System.out.println(howManyEven(1,2,3,4,5));
    }
    public static int howManyEven(int num1, int num2, int num3,int num4,int num5) {
        int count = 0;
        int[] arr = new int[]{num1, num2, num3, num4, num5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
