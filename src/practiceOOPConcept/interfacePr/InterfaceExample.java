package practiceOOPConcept.interfacePr;

public class InterfaceExample implements MyInterface{

    public void demo(){
        System.out.println("This is the implementation of the demo method");
    }


    public static void main(String[] args) {
        MyInterface obj = new InterfaceExample();

        obj.demo();

//        InterfaceExample obj = new InterfaceExample();
//        obj.demo();
//        System.out.println(MyInterface.num);
    }

}
