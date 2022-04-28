package practiceOOPConcept.polymorphism.dynamicPolymorphism;

public class Test {

    public static void main(String[] args) {

        // Creating object of Child1
        Parent a;

        a = new Child1();
        a.print();
        a = new Child2();
        a.print();
    }
}
