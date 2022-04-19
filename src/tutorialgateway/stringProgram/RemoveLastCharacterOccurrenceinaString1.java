package tutorialgateway.stringProgram;

public class RemoveLastCharacterOccurrenceinaString1 {
    public static void main(String[] args) {
        String word = "Zeynab Nasib";
        char occurence = 'a';

   StringBuffer wordBuf = new StringBuffer(word);
 int position = 0;
   for(int i = 0; i < wordBuf.length(); i++){
       if(wordBuf.charAt(i) == occurence){
           position = i;

       }
   }

    //    System.out.println(position);
wordBuf.deleteCharAt(position);
        System.out.println(wordBuf);
        wordBuf.replace(0,1,"d");
        System.out.println(wordBuf);
        wordBuf.reverse();
        System.out.println(wordBuf);
    }
}
