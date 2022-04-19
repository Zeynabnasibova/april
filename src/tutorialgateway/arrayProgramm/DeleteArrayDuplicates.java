package tutorialgateway.arrayProgramm;
import java.util.ArrayList;
import java.util.Arrays;
public class DeleteArrayDuplicates {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,1,2,3,3};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);

        arr = new int [list.size()];
        for(int i =0;i< arr.length;i++){
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }
}
