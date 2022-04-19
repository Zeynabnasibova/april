package tutorialgateway.arrayProgramm;
import java.util.Arrays;
public class SortArrayinAscendingOrder {
    public static void main(String[] args) {
        int [] arr = new int [] {6,2,1,4,5,3};//123456

        for(int i = 0 ; i < arr.length; i++){
            int temp = 0;
            for(int j = i+1; j < arr.length;j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
