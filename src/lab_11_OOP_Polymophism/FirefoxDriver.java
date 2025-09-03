package lab_11_OOP_Polymophism;

public class FirefoxDriver extends WebDriver{
    @Override
    public void initWebDriver() {
        System.out.println("Firefox is init");
    }

    @Override
    public void openPage() {
        System.out.println("Firefox open page");
    }
}
