package lab_10_OOP_Abstract.LoginPage;

public abstract class LoginPage {

    protected abstract String username();
    protected abstract String password();
    protected abstract String loginBtn();
    public void login(){
        System.out.println(username());
        System.out.println(password());
        System.out.println(loginBtn());
    }

    public abstract void validateLoginPage();
}
