package hackerrank;

import java.util.Scanner;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Solution1 obj1 = new Solution1();
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        Integer [] arr = new Integer [arrLength];
        for(int i = 0; i < arrLength;i++){
            arr[i] = input.nextInt();
        }

        int strLength = input.nextInt();
        String [] str = new String [strLength];
        for(int i = 0; i < strLength;i++){
            str[i] = input.nextLine();
        }
        System.out.println(obj1.sum(arr));
        System.out.println(obj1.sum(str));
    }
    public Integer sum(Integer [] arr){
        Integer sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public String sum(String [] arr){
        String concat = "";
        for(int i = 0; i < arr.length; i++){
            concat += arr[i];
        }
        return concat;
    }
}