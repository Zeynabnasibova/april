package tutorialgateway.arrayProgramm;
import java.util.Scanner;

public class CountOccurrenceofanElementinanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int count = 0;
        int occurrence = 10;
        for(int i = 0; i < size; i++){
            if(arr[i] == occurrence){
                count++;
            }
        }
        System.out.println(count);

    }
}
