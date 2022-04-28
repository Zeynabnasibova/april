package practiceOOPConcept.thisReference;
// Java code for using this() to
// invoke current class constructor
public class TestThis {

    int a;
    int b;

    //Default constructor
    TestThis() {
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }
    //Parameterized constructor
    TestThis(int a, int b){


        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    public static void main(String[] args)
    {
        TestThis object = new TestThis();
    }
}