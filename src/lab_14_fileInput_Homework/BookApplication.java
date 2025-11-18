package lab_14_Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookApplication {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        String DBFilePath = new BookDataFactory().initAbsolutedFilePath("bookData01.txt");
        BookDataFactory bookDataFactory = new BookDataFactory();

        boolean isContinue = true;
        do{
            //1. start by printing menu
            printBookMenu();

            //2. get the user's choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice number: ");
            int menuUserChoice = scanner.nextInt();

            switch (menuUserChoice){
                case 1:{
                    Book book = inputBookInformation(scanner);
                    bookDataFactory.addNewBook(bookList,book);
                    break;
                }
                case 2:{
                    System.out.println("Please enter book isbn to search: ");
                    String isbn = scanner.next();
                    bookDataFactory.findBook(bookList,isbn);
                    break;
                }
                case 3:{
                    System.out.println("Please enter isbn book to search: ");
                    String isbn = scanner.next();
                    bookDataFactory.updateBook(bookList,isbn,scanner);
                    break;
                }
                case 4:{
                    System.out.println("Please enter isbn to delete a book: ");
                    String isbn = scanner.next();
                    List<Book> books = new ArrayList<>();
                    books = bookDataFactory.deleteBook(bookList,isbn);
                    bookList.clear();
                    bookList=books;
                    break;
                }
                case 5:{
                    System.out.println("print the booklist");
                    bookDataFactory.printBookList(bookList);
                    break;
                }
                case 6:{
                    isContinue = false;
                    System.out.println("Thank you!");
                    break;
                }
            }
        }while(isContinue == true);
    }

    public static void printBookMenu(){
        System.out.println("========== Simple Book Management Application ======= ");
        System.out.println("1. New book");
        System.out.println("2. Find a book");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("6. Exit");
    }

    public static Book inputBookInformation(Scanner scanner){
        System.out.println("Please input book isbn: ");
        String isbn = scanner.next();
        if (isbn.isEmpty()){
            do{
                System.out.println("book isbn can't be empty");
                System.out.println("Please input book isbn: ");
                isbn = scanner.next();
            }while(!isbn.isEmpty());
        }
        System.out.println("Please input book title: ");
        String title = scanner.next();
        System.out.println("Please input book author: ");
        String author = scanner.next();
        System.out.println("Please input book year: ");
        int year = Integer.parseInt(scanner.next());
        return new Book(isbn,title,author,year);
    }

}
