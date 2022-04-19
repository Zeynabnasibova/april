package tutorialgateway.conversionPrograms;

public class StringtoDouble {
    public static void main(String[] args) {
        String str = "1232.142";
        double  d = Double.parseDouble(str);
        System.out.println(d);

        double d1 = Double.valueOf(str);
        System.out.println(d1);
    }
}
