package lab_08_AutoBoxing;

public class TestBox {
    private Integer i;
    private int j;

    public static void main(String[] args) {
        new TestBox().go();
    }

    public void go(){
        j = i; // i=null
        System.out.println(j);
        System.out.println(i);
    }
}
