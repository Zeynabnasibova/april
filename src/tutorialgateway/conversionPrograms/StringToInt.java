package tutorialgateway.conversionPrograms;

public class StringToInt {
    public static void main(String[] args) {
        String str = "9897";
        int num = Integer.valueOf(str);

        int num2 = Integer.parseInt(str);
        System.out.println(num2);
    }
}
