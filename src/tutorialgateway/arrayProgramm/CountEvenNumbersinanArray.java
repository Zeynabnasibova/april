package tutorialgateway.arrayProgramm;

public class CountEvenNumbersinanArray {
    public static void main(String[] args) {
        int [] arr = new int [] { 1, 2, 3, 4, 5, 6,7,8 ,9,10};
        int countEven = 0;
        int countOdd =0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }

        }
        System.out.println(countEven);
        System.out.println(countOdd);

    }
}
