package tutorialgateway.conversionPrograms;

public class DoubletoString {
    public static void main(String[] args) {

        double db = 9.7;
        String strdb = Double.toString(db);
        System.out.println(strdb);
        //or
        String str1 = String.valueOf(db);
        System.out.println(str1);
    }
}
