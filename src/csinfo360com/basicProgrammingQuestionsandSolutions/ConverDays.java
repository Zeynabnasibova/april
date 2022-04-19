package csinfo360com.basicProgrammingQuestionsandSolutions;

public class ConverDays {
    public static void main(String[] args) {
/*
Program to convert Days into years, months and Weeks

 */
        int allDay = 365;
        int years = allDay / 365;
        int month = allDay / 30;
        int week =  allDay / 7;
        System.out.println(years);
        System.out.println(month);
        System.out.println(week);
    }
}
