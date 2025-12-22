package lab_08_AutoBoxing;

public class TestBox {
    private Integer i; //default = null
    private int j; //default = 0

    public static void main(String[] args) {
        new TestBox().go();
    }

    public void go(){
        //ERROR Exception NullPointerException:
        // Cannot invoke "java.lang.Integer.intValue()" because "this.i" is null
        j = i; // i=null
        System.out.println(j);
        System.out.println(i);

        //PASS: convert between Integer <-> int
        Integer x = 10;
        int xx = x.intValue();

        int y = 5;
        Integer yy = Integer.valueOf(y);
    }
}
