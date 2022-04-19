package tutorialgateway.arrayProgramm;

public class SecondSmallestArrayNumber {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5,6};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] < min){
                min  = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min && arr[i] < secondMin){
                secondMin = arr[i];

            }
        }
        System.out.println(secondMin);
    }
}
