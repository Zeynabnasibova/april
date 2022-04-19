package tutorialgateway.numbers;

public class ArithmeticSumUsingMethodOverloading {

    public static void main(String[] args) {
int a1 = 6;
int b1 = 2;

double a2 = 6;
double b2 = 2;

float a3 = 6;
float b3 = 2;

        System.out.println(add(a1,b1));
    }


    public static int add(int a ,int b){
        int sum = a + b;
        return sum;
    }

    public  static double add(double a, double b){
      double min = a - b;
        return min;
    }

    public  static float add(float a, float b){
     float div = a / b;
        return div;
    }

}
