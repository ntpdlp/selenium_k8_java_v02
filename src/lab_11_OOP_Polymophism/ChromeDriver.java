package lab_11_OOP_Polymophism;

public class ChromeDriver extends WebDriver{
    @Override
    public void initWebDriver() {
        System.out.println("ChromeDriver is initialize");
    }

    @Override
    public void openPage() {
        System.out.println("ChromeDriver open page");
    }
}
