package tutorialgateway.arrayProgramm;

public class CountPositiveandNegativeNumbersinanArray {
    public static void main(String[] args) {

        int [] arr = new int [] { -1, -2, -3, -4, -5, -6,7,8 ,9,10};
        int countPos = 0;
        int countNeg =0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                countPos++;
            }else{
                countNeg++;
            }

        }
        System.out.println(countPos);
        System.out.println(countNeg);

    }
}
