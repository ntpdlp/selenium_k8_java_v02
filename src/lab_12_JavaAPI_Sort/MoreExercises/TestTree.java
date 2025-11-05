package lab_12_JavaAPI_Sort.MoreExercises;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {

    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go(){
        Book b1 = new Book("Java");
        Book b2 = new Book("Python");
        Book b3 = new Book("Javascript");

        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        System.out.println(bookSet);
    }
}


class Book implements Comparable<Book>{
    private String title;

    public Book(String t){
        title = t;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}