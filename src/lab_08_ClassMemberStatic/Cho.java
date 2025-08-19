package lab_08_ClassMemberStatic;

import java.sql.SQLOutput;

public class Cho {

    protected static String name = "Cho";

    //co the override, vi thuoc object
    public void sayHello(){
        System.out.println("my name is ".concat(name));
    }

    //ko the override
    public static void doSomething(){
        System.out.println("KHONG THE OVERRIDE, VI TA THUOC CLASS KO CO THUOC OBJECT"); //Cho.doSomething();
        System.out.println("CO TROI CO DAT MOI CO OBJECT, STATIC LA TROI LA DAT");
    }
}
