package csinfo360com.Crackingthecodinginterview.step4;

public class AllDigitsCount {
    public static void main(String[] args) {
        int num = 292;
        int count = 0;
        while (num != 0){
            int remainder = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
