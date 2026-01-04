package lab_03_loop_array.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Book {
    private int id;
    private String title;
    private String author;
    private ArrayList<Review> reviews; //composition association type

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        reviews = new ArrayList<Review>();

    }

    public void addBookReview(Review review){
        reviews.add(review);
    }

    @Override
    public String toString() {
        return String.format("[Book] title: %s, author: %s",title,author);
    }

    public void printBookReview(){
        for(Review review:reviews){
            System.out.println(review.toString());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ana", "Peter", "Bana"));
        Collections.sort(names);
        System.out.println(names);

    }

}
