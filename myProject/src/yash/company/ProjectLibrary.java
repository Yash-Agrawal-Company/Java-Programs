package yash.company;
import java.util.Scanner;

class Library{
    String[] books;
    int noOfBooks;
     Library(){
        this.books = new String[100];
         this.noOfBooks = 0;
    }
    void addBooks(String book){
         this.books[noOfBooks] = book;
         noOfBooks++;
    }
    void showAvailableBooks(){
        System.out.println("Available books are -: ");
        for (int i = 0; i < noOfBooks; i++) {
            if (books[i] == null) {
                continue;
            }
            System.out.printf("\"%s\"\n",books[i]);
        }
    }
    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            if(books[i]==null){
                continue;
            }
            else if (books[i].compareTo(book)==0) {
                System.out.println( "\""+book+"\""+"has been issued successfully ");
                this.books[i] = null;
                return;
            }
        }
            System.out.println("\""+book+"\""+" book is not present in the library ");

    }
    void returnBook(String book){
         addBooks(book);
        System.out.printf("\"%s\" book has been added \n",book);
    }
}
public class ProjectLibrary {
    public static int terminate(int loop){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue and 0 to exit . . . ");
        loop = sc.nextInt();
        switch (loop){
            case 1:
                loop = 1;
                break;
            case 0:
                loop = 0;
                break;
            default:
                System.out.println("Invalid input");

        }
        return loop;
    }
    public static void main(String[] args) {
        /*
        It's a library where we can perform some operations which are expected from a library
        1. Add a book
        2. Return a book
        3. Show Available books
        4. Array to store the issues books
         */
        int choice,Cchoice,Dchoice,loop=0;
        int noOfBooks;
        String Bchoice;
        Library Central = new Library();
        Library Diploma = new Library();


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the library department");
        System.out.println("[1] -> Central Library \n[2] -> Diploma Library");
        System.out.print("Your response -> ");
        choice = sc.nextInt();
        do {

            switch (choice) {
                case 1:
                    System.out.println("Welcome to the Central Library department - ");
                    System.out.println("[1] -> Add a book");
                    System.out.println("[2] -> Issue a book");
                    System.out.println("[3] -> Return a book");
                    System.out.println("[4] -> See Available books");

                    System.out.print("Your response -> ");
                    Cchoice = sc.nextInt();
                    switch (Cchoice) {
                        case 1:
                            System.out.print("Enter the number of books you want to add -> ");
                            noOfBooks = sc.nextInt();
                            sc.nextLine();
                            for (int i = 1; i <= noOfBooks; i++) {
                                System.out.print("Enter the name of the book " + i + " you want to add -> ");
                                Bchoice = sc.nextLine();
                                Central.addBooks(Bchoice);
                                System.out.println("Book has been added ");
                            }
                                loop = terminate(loop);

                            break;
                        case 2:
                            System.out.print("Enter the name of the book you want to Issue -> ");
                            sc.nextLine();
                            Bchoice = sc.nextLine();
                            Central.issueBook(Bchoice);
                            loop = terminate(loop);
                            break;
                        case 3:
                            System.out.print("Enter the name of the book you want to return -> ");
                            sc.nextLine();
                            Bchoice = sc.nextLine();
                            Central.returnBook(Bchoice);
                            loop = terminate(loop);
                            break;
                        case 4:
                            Central.showAvailableBooks();
                            loop = terminate(loop);
                            break;
//
                        default:
                            System.out.println("Invalid input ");
                    }
                    break;
                case 2:
                    System.out.println("Welcome to the Polytechnic Library department - ");
                    System.out.println("[1] -> Add a book");
                    System.out.println("[2] -> Issue a book");
                    System.out.println("[3] -> Return a book");
                    System.out.println("[4] -> See Available books");
                    System.out.println("Your response -> ");
                    Dchoice = sc.nextInt();
                    switch (Dchoice) {
                        case 1:
                            System.out.print("Enter the number of books you want to add -> ");
                            noOfBooks = sc.nextInt();
                            sc.nextLine();
                            for (int i = 1; i <= noOfBooks; i++) {
                                System.out.print("Enter the name of the book " + i + " you want to add -> ");
                                Bchoice = sc.nextLine();
                                Diploma.addBooks(Bchoice);
                                System.out.println("Book has been added ");
                            }
                            loop = terminate(loop);
                            break;
                        case 2:
                            System.out.print("Enter the name of the book you want to Issue -> ");
                            sc.nextLine();
                            Bchoice = sc.nextLine();
                            Diploma.issueBook(Bchoice);
                            loop = terminate(loop);
                            break;
                        case 3:
                            System.out.print("Enter the name of the book you want to return -> ");
                            sc.nextLine();
                            Bchoice = sc.nextLine();
                            Diploma.returnBook(Bchoice);
                            loop = terminate(loop);
                            break;
                        case 4:
                            Diploma.showAvailableBooks();
                            loop = terminate(loop);
                            break;
                        default:
                            System.out.println("Invalid input ");
                    }
                    break;
                default:
                    System.out.println("Invalid input ");
            }
        }while (loop==1);
    }
}
