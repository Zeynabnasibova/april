package practiceOOPConcept.superKeyword;


/* superclass Person */
class Person2 {
    Person2() {
        System.out.println("Person class Constructor");
    }
}

/* subclass Student extending the Person class */
class Student2 extends Person {
    Student2() {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

/* Driver program to test*/
class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
    }
}