package lab_06_OOPConcept;

class Books {
    String title;
    String author;

}

class BooksTestDrive{
    public static void main(String[] args) {
        Books[] books = new Books[2];
        books[0].title = "The Grapes of Java";
        books[1].title = "The Java Gatsby";
        books[0].author = "Bob";
        books[1].author = "Sue";

        int x = 0;
        while(x<2){
            System.out.println(books[x].title + " by " + books[x].author);
            x +=1;
        }
    }
}




