package tutorialgateway.arrayProgramm;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class UniqueArrayItems {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 1, 2, 3, 5};//1, 2, 3, 4, 1, 2, 3, 5

        ArrayList<Integer> list = new ArrayList<>();//1,2,3,4,5
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        ArrayList <Integer> uniqueList = new ArrayList<>();
        for(int i = 0; i < list.size();i++){//1,2,3,4,5
            int count =0;
            for(int j =0; j< arr.length; j++){//1, 2, 3, 4, 1, 2, 3, 5
                if(list.get(i)==(arr[j])){
                    count++;
                }
            }
            if(count == 1){
                uniqueList.add(list.get(i));
            }
        }
        System.out.println(uniqueList);
        int [] unique = new int [uniqueList.size()];
        for(int i =0; i< unique.length;i++){
            unique[i] = uniqueList.get(i);
        }
        System.out.println(Arrays.toString(unique));
    }
}
