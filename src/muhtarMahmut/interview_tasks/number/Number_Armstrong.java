package muhtarMahmut.interview_tasks.number;

public class Number_Armstrong {

    //153 = 1 kub + 5 kub + 3 kub = 153
    public static void main (String [] args){

        int number = 153;
        int armstrong = 0;
        int temp = number;

        while( number != 0){
         int remainder = number % 10;
         armstrong = armstrong + remainder * remainder * remainder;
         number = number / 10;
        }

        if(temp == armstrong){
            System.out.println(temp + " is armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
}
