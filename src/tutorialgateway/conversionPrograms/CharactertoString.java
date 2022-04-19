package tutorialgateway.conversionPrograms;

public class CharactertoString {
    public static void main(String[] args) {
        char ch = 'k';
        String strChar = "" + ch;
        System.out.println(strChar);

        //or

        String strCh = Character.toString(ch);
        System.out.println(strCh);
    }
}
