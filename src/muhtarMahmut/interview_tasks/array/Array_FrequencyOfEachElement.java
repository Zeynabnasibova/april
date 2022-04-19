package muhtarMahmut.interview_tasks.array;

public class Array_FrequencyOfEachElement {
     /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static void main(String[] args) {
       String [] arr = new String[] {"Apple","Banana","Apple","Cherry"};
                                   //"Apple","Banana","Apple","Cherry"

       for(int i =0; i< arr.length; i++){
           int count = 0;
           for(int j =0; j< arr.length; j++){
               if(arr[i].equals(arr[j])){
                   count++;
               }
           }
           System.out.println(arr[i] + " = " + count );
       }
    }
}
