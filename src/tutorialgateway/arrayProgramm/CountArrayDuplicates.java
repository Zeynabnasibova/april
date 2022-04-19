package tutorialgateway.arrayProgramm;

public class CountArrayDuplicates {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,1,2,2};

        // 1
        //


        int count = 0;

        for(int i = 0; i < arr.length; i++){//1
            for(int j = i+1; j < arr.length; j++){//2 3 1 2 2
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
//1 + 1
