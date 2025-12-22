package lab_08_AutoBoxing;

public class TestBox {
    private Integer i;
    private int j;

    public static void main(String[] args) {
        new TestBox().go();
    }

    public void go(){
        //Exception NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "this.i" is null
        j = i; // i=null
        System.out.println(j);
        System.out.println(i);
    }
}
