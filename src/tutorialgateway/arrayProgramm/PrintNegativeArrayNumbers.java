package tutorialgateway.arrayProgramm;

public class PrintNegativeArrayNumbers {
    public static void main(String[] args) {

        int [] arr = new int [] {-9,1,2,3,4,5,-6,-7,-8};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
