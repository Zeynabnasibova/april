package practiceOOPConcept.abstractionA;

public abstract  class AbstractDemo {

    public AbstractDemo(){

    }


   static int num = 10;
    private int num1 = 11;
    protected int num2 = 12;
    private  int num3 = 13;
    final int num4 = 14;
    int num5 = 2;
  public static void method1(){
        System.out.println("Static method");
    }

    private void method2(){
        System.out.println("Non static");
    }

    public  abstract void methodAbstract();//it can not be final; and can not be static

}
