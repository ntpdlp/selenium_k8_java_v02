package lab_11_OOP_Polymophism;

public class WebDriverControllerTesting {
    public static void main(String[] args) {
        boolean isChromeDriver = System.getenv("browser").equals("Chrome");
        boolean isFirefoxDriver = System.getenv("browser").equals("Firefox");

        //Day la y nghia cua Polymorphism: transform between multiple IS-A forms
        WebDriver driver;
        if(isChromeDriver){
            driver = new ChromeDriver();
        } else if (isFirefoxDriver) {
            driver = new FirefoxDriver();
        }
    }
}
