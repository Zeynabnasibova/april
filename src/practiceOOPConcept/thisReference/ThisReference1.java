package practiceOOPConcept.thisReference;

public class ThisReference1 {
    int a;
    int b;

    // Parameterized constructor
    ThisReference1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {
        ThisReference1 obj = new ThisReference1(10,20);
        obj.display();
    }

}
