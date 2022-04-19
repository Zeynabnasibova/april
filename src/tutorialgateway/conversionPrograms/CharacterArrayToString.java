package tutorialgateway.conversionPrograms;

public class CharacterArrayToString {
    public static void main(String[] args) {
        char [] ch = new char [] {'d','o','l'};

        String str1 = new String (ch);
        System.out.println(str1);

        String chToStr = String.copyValueOf(ch);
        System.out.println(chToStr);

        String chToStr1 = String.valueOf(ch);
        System.out.println(chToStr1);

        char ch1[] = {'L', 'e', 'a', 'r', 'n', ' ', 'J', 'a', 'v', 'a'};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < ch1.length; i++)
        {
            sb.append(ch1[i]);
        }

        String chToStr2 = sb.toString();

        System.out.println(chToStr2);
    }
}
