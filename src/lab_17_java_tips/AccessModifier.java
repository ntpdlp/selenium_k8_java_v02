package lab_17_java_tips;

public class AccessModifier {
    public void publicMethod(){};
    protected void protectedMethod(){};
    private void privateMethod(){};
    void defaultMethod(){};

}


class SubClass extends AccessModifier{
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.publicMethod();
        sc.protectedMethod();
        sc.defaultMethod();
    }
}
