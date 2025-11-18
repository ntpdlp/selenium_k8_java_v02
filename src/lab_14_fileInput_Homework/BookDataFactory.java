package lab_14_Homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookDataFactory {


    public String initAbsolutedFilePath(String fileName) {
        String currentFolder = System.getProperty("user.dir");
        String filePathFromContentRoot = "src/lab_14_Homework/".concat(fileName);
        return currentFolder.concat("/").concat(filePathFromContentRoot);
    }

    public void addNewBook(List<Book> bookList,Book book){
        bookList.add(book);
        System.out.println("....Saved new book successfully.");
    }

    public boolean findBook(List<Book> bookList,String isbn){
        if (isbn.isEmpty()) {
            throw new IllegalArgumentException("[ERR]The Book ISBN can't be empty.");
        }

        boolean isFound = false;
        for (Book book : bookList) {
           isFound = (book.getIsbn().compareToIgnoreCase(isbn) == 0)?true:false;
           if(isFound){
               System.out.println("Found book with isbn: ".concat(isbn));
               System.out.println(book.toString());
               return true;
           }
        }
        System.out.println("No found !");
        return isFound;
    }

    public void updateBook(List<Book> bookList,String isbn, Scanner scanner){
        boolean isFoundBook = findBook(bookList,isbn);
        if (isFoundBook){
            for (Book book : bookList) {
                if (book.getIsbn().equals(isbn)){
                    System.out.println("Please enter new author name: ");
                    String new_authorName = scanner.next();
                    book.setAuthor(new_authorName.isEmpty()?book.getAuthor():new_authorName);
                    System.out.println("Please enter new title: ");
                    String new_title = scanner.next();
                    book.setTitle(new_title);
                    System.out.println("Please enter new year: ");
                    int new_year = scanner.nextInt();
                    book.setYear(new_year);
                }
            }
        }

    }

    public List<Book> deleteBook(List<Book> bookList, String isbn){
        List<Book> newBookList = new ArrayList<>();
        if(findBook(bookList,isbn)){
            for (Book book : bookList) {
                if(book.getIsbn().equals(isbn)){
                    System.out.println("... deleted book successfully !");
                }else{
                    newBookList.add(book);
                }
            }
        }

        return newBookList;
    }
    public void writeToFile(List<Book> bookList, String fileName) {
        if (bookList.isEmpty() | fileName.isEmpty()) {
            System.out.println("[WARNING] bookList or fileName can't be empty.");
            return;
        }

        try (
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ) {
            for (Book book : bookList) {
                bufferedWriter.write(book.toString());
                System.out.println(book.toString());
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Booklist was updated successfully! ");
    }


    public void printBookList(List<Book> bookList){
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }


    public static void main(String[] args) {

        String absolutedFilePath = new BookDataFactory().initAbsolutedFilePath("bookData01.txt");
        Book book1 = new Book("1234","Clean Code","Robert Martin",2009);
        Book book2 = new Book("5678","Agile Software","Stevan Zevanovic",2015);
        Book book3 = new Book("9012","Java HeadFirst","Robert Martin",2009);
        List<Book> bookList = Arrays.asList(book1,book2,book3);
        new BookDataFactory().writeToFile(bookList,absolutedFilePath);

    }
}
