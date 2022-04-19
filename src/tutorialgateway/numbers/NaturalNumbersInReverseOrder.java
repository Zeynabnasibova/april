package tutorialgateway.numbers;

public class NaturalNumbersInReverseOrder {
    public static void main(String[] args) {
        naturalNumreversorder(5);
    }
    public static void naturalNumreversorder(int n){

        for(int i = n; i >= 0; i--){

            System.out.println(i + " ");
        }
    }
}
