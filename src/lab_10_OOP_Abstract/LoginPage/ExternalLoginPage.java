package lab_10_OOP_Abstract.LoginPage;

public class ExternalLoginPage extends LoginPage{
    @Override
    public String username() {
        return "external#username";
    }

    @Override
    public String password() {
        return "external#password";
    }

    @Override
    public String loginBtn() {
        return "external#loginBtn";
    }

    @Override
    public void validateLoginPage() {
        System.out.println("Welcome to External Login Page");
    }
}
