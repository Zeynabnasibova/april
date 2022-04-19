package tutorialgateway.conversionPrograms;

public class InttoString {
    public static void main(String[] args) {
        int num = 5;
        String str = Integer.toString(num);
        System.out.println(str);

        String str2 = String.valueOf(num);
        System.out.println(str2);

    }
}
