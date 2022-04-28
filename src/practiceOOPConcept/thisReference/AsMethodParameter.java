package practiceOOPConcept.thisReference;

public class AsMethodParameter {

    int a;
    int b;

    // Default constructor
    AsMethodParameter() {
        a = 10;
        b = 20;
    }

    // Method that receives 'this' keyword as parameter
    void display(AsMethodParameter obj) {
        System.out.println("a = " +obj.a + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }

    public static void main(String[] args) {
        AsMethodParameter object = new AsMethodParameter();
        object.get();
    }
}