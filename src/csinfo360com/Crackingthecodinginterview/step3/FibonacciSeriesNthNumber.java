package csinfo360com.Crackingthecodinginterview.step3;

public class FibonacciSeriesNthNumber {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21
        int num = 8;
        int first = 0;
        int second = 1;
        int next = 0;
        System.out.print(first + " "  + second);
        for(int i = 2; i < num; i++ ){
            next = first + second;
            System.out.print( " " +next );
            first = second;
            second = next;
        }


    }
}
