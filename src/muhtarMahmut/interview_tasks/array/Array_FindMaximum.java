package muhtarMahmut.interview_tasks.array;

public class Array_FindMaximum {
      /*
        Write a function that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4};
        int max  = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
