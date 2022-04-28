package practiceOOPConcept.abstractionA;

public class UseAbstarctClass extends AbstractDemo {

    @Override
    public void methodAbstract() {
        System.out.println("My method");
    }

    public static void main(String[] args) {

        AbstractDemo obj = new UseAbstarctClass();
        obj.methodAbstract();

        AbstractDemo.method1();

        System.out.println( AbstractDemo.num);

        System.out.println(obj.num2);


    }

}
