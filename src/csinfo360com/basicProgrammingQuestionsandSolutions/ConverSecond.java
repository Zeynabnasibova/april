package csinfo360com.basicProgrammingQuestionsandSolutions;

public class ConverSecond {
    /*
    Program to convert seconds to hour, minute and seconds
     */
    public static void main(String[] args) {
        int allSecond = 360;

        int hour = allSecond / 3600;

        allSecond = allSecond % 3600;

        int mint = allSecond / 60;

        int sec = allSecond % 60;

        System.out.println("Hours="+hour+"\nMinutes="+mint+"\nSecond="+sec);

    }
}