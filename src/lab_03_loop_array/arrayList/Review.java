package lab_03_loop_array.arrayList;

public class Review {
    private int id;
    private String review_content;

    public Review(int id, String review_content) {
        this.id = id;
        this.review_content = review_content;
    }

    public String toString(){
        return String.format("Review: %d, %s",id, review_content);
    }
}
