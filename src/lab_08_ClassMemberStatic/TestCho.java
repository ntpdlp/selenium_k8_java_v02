package lab_08_ClassMemberStatic;

public class TestCho {

    public static void main(String[] args) {

        //these instances calling instance methods
        Cho choCon = new ChoCon();
        choCon.sayHello();

        Cho choMe = new ChoMe();
        choMe.sayHello();


        //calling static class methods
        Cho.doSomething();

    }
}
