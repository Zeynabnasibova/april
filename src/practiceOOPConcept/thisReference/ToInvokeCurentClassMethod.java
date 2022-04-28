package practiceOOPConcept.thisReference;

public class ToInvokeCurentClassMethod {
    void display() {
        // calling function show()
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show function");
    }


    public static void main(String args[]) {
        ToInvokeCurentClassMethod t1 = new ToInvokeCurentClassMethod();
        t1.display();
    }
}