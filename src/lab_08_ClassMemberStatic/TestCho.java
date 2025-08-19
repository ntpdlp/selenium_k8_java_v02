package lab_08_ClassMemberStatic;

public class TestCho {

    public static void main(String[] args) {

        //these instances calling instance methods
        Cho choCon = new ChoCon();

        Cho choMe = new ChoMe();
        choCon.sayHello();
        choMe.sayHello();


        //calling static class methods
        Cho.doSomething();

    }
}
