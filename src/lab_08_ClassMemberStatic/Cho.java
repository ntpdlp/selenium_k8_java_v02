package lab_08_ClassMemberStatic;

public class Cho {

    //co the override static variable
    protected static String name = "Cho";

    //co the override, vi thuoc object
    public void sayHello(){
        System.out.println("my name is ".concat(name));
    }

    //XXX ko the override method
    public static void doSomething(){
        System.out.println("KHONG THE OVERRIDE, VI TA THUOC CLASS KO CO THUOC OBJECT"); //Cho.doSomething();
        System.out.println("CO TROI CO DAT MOI CO OBJECT, STATIC LA TROI LA DAT");
    }
}
