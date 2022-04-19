package tutorialgateway.arrayProgramm;

public class FindLargestArrayNumber {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("max = " +max);
        System.out.println("min = " + min);
    }
}
