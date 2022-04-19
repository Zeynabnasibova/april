package tutorialgateway.conversionPrograms;

public class FloattoString {
    public static void main(String[] args) {
        float f = 7.1f;
        String strF = Float.toString(f);
        System.out.println(strF);
        //or
        String str1 = String.valueOf(f);
        System.out.println(str1);
    }
}
