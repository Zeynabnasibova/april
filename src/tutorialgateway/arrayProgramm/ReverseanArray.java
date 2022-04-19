package tutorialgateway.arrayProgramm;
import java.util.Arrays;
public class ReverseanArray {
    public static void main(String[] args) {
         int [] arr = new int [] {16,26,36,46,56};

         for(int i = arr.length -1; i >= 0; i--){
             System.out.print(arr[i] + " ");
         }


    }
}
