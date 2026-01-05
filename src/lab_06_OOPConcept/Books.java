package lab_06_OOPConcept;

class Books {
    String title;
    String author;

}

class BooksTestDrive{
    public static void main(String[] args) {
        Books[] books = new Books[2];

        //Problem: Will catch Error
        //Cannot assign field "title" because "books[0]" is null
        books[0].title = "The Grapes of Java";
        books[0].author = "Bob";
        books[1].title = "The Java Gatsby";
        books[1].author = "Sue";


        //use new operator to create books object , not null
    }
}




