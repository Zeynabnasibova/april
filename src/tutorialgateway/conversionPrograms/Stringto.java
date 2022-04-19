package tutorialgateway.conversionPrograms;

import java.util.Arrays;

public class Stringto {
    public static void main(String[] args) {
        String str = "Zeynab Nasibova";

        //String t--> char
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }

        System.out.println();
        //String --> int
        String strNum = "144345";
        int numInt1 = Integer.parseInt(strNum);
        int numInt2 = Integer.valueOf(strNum);

        System.out.println(numInt1);
        System.out.println(numInt2);

        //String --> Double
        double d1 = Double.parseDouble(strNum);
        double d2 = Double.valueOf(strNum);
        System.out.println(d1);
        System.out.println(d2);

        //String --> Float
        float f1 = Float.parseFloat(strNum);
        float f2 = Float.valueOf(strNum);
        System.out.println(f1);
        System.out.println(f2);


        //String --> Long
        long l1 = Long.parseLong(strNum);
        long l2 = Long.valueOf(strNum);
        System.out.println(l1);
        System.out.println(l2);

        //String --> String []
        String [] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        //String --> char []
        char [] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));





    }
}
