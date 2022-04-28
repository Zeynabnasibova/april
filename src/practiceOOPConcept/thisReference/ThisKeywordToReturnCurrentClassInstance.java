package practiceOOPConcept.thisReference;

public class ThisKeywordToReturnCurrentClassInstance {
    int a;
    int b;

    //Default constructor
    ThisKeywordToReturnCurrentClassInstance() {
        a = 10;
        b = 20;
    }

    //Method that returns current class instance
    ThisKeywordToReturnCurrentClassInstance get() {
        return this;
    }

    //Displaying value of variables a and b
    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {
        ThisKeywordToReturnCurrentClassInstance object = new ThisKeywordToReturnCurrentClassInstance();
        object.get().display();
    }
}