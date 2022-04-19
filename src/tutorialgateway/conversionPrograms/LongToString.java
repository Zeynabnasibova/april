package tutorialgateway.conversionPrograms;

public class LongToString {
    public static void main(String[] args) {
        long l = 9798698l;
        String strL = Long.toString(l);
        System.out.println(strL);

        //or
        String str1 = String.valueOf(l);
        System.out.println(str1);

    }
}
