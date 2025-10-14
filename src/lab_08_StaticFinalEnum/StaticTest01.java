package lab_08_StaticFinalEnum;

public class StaticTest01 {
    int x=10;

    public static void go(final int x){
        System.out.println(x);

    }

    public static void main(String[] args) {
        StaticTest01.go(7);
        StaticTest01.go(9);
    }
}
