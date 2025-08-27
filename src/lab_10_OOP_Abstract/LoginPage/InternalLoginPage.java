package lab_10_OOP_Abstract.LoginPage;

public class InternalLoginPage extends LoginPage{
    @Override
    protected String username() {
        return "internal_username";
    }

    @Override
    protected String password() {
        return "internal_password";
    }

    @Override
    protected String loginBtn() {
        return "internal_loginBtn";
    }

    @Override
    public void validateLoginPage() {
        System.out.println("Welcome to Internal Login Page");
    }
}
