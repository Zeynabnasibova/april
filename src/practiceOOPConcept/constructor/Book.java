package practiceOOPConcept.constructor;

public class Book {

    public Book() {
        System.out.println("I love to read book");
    }

    public Book(String bookName){

        System.out.println("I love to read a book " + bookName);
    }

    public Book(String bookName, int page){

        System.out.println("I love to read book " + bookName + "whith a page number less than" + page);

    }
}


class MyBook{

    public static void main(String[] args) {

        Book obj = new Book();

        Book obj1 = new Book("\"Coding \"");

        Book obj2 = new Book("Coding ", 200);

    }
}

