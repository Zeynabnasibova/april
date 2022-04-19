package tutorialgateway.conversionPrograms;

public class StringToLong {
    public static void main(String[] args) {
        String str = "99797";
        Long l1 = Long.valueOf(str);

        Long l2 = Long.parseLong(str);
        System.out.println(l1);
        System.out.println(l2);
    }
}
