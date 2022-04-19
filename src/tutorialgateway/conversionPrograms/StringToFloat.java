package tutorialgateway.conversionPrograms;

public class StringToFloat {
    public static void main(String[] args) {
        String str = "668689.9";
        Float f = Float.parseFloat(str);

        System.out.println(f);

        Float f1 = Float.valueOf(str);
        System.out.println(f1);
    }
}
