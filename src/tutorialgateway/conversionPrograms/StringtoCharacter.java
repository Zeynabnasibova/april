package tutorialgateway.conversionPrograms;

public class StringtoCharacter {
    public static void main(String[] args) {
        String str = "Zeynab";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
