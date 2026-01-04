package lab_03_loop_array.arrayList;

public class BookTestRunner {
    public static void main(String[] args) {
        Book book1 = new Book(0001,"Head first Java", "Henry");
        book1.addBookReview(new Review(01,"good book to start Java"));
        book1.addBookReview(new Review(02,"clear structure"));
        book1.addBookReview(new Review(03,"easy to understand"));

        System.out.println(book1.toString());
        book1.printBookReview();
    }
}
