package lab_10_OOP_Abstract.LoginPage;

public class TestLoginPage {
    public static void main(String[] args) {
        LoginPage internalLP = new InternalLoginPage();
        LoginPage externalLP = new ExternalLoginPage();

        internalLP.login();
        internalLP.validateLoginPage();

        externalLP.login();
        externalLP.validateLoginPage();
    }

    public static void testLogin(LoginPage loginPage){
        loginPage.login();
        loginPage.validateLoginPage();
    }
}
