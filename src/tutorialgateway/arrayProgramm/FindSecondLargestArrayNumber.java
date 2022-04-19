package tutorialgateway.arrayProgramm;

public class FindSecondLargestArrayNumber {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

                }
            }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != max && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
        }
}
