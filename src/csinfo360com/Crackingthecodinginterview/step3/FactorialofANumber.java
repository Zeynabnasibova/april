package csinfo360com.Crackingthecodinginterview.step3;

public class FactorialofANumber {
    //5 = 1*2*3*4*5
    public static void main(String[] args) {
        System.out.println(factorialM(5));
    }

    public static int factorialM(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}