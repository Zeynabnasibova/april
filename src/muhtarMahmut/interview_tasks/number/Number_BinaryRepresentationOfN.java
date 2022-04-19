package muhtarMahmut.interview_tasks.number;

public class Number_BinaryRepresentationOfN {
     /*
    return the number of '1's in the binary representation of n for any integer n, where n > 0
    Example:
        for n=6 the binary representation is '110' and the number of '1's in that representation is 2
     */

    public static void main(String[] args) {

        int number = 135;
        int binary = 0;
        int temp = 1;

        while(number != 0){
            int remainder = number % 10;
            number = number / 10;
            binary = binary + remainder * temp;
            temp = temp * 100;
        }
        System.out.println(binary);
     //   System.out.println(Integer.toBinaryString(number));
    }
}
