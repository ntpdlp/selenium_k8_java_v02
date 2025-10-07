package lab_10_OOP_Abstract.ReferenceType;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPolymorphismApplication {
    public static void main(String[] args) {
        WebDriver chrome = new ChroomeDriver();
        WebDriver gecko = new GeckoFireFoxDriver();

        ArrayList<WebDriver> webDrivers = new ArrayList<>(Arrays.asList(chrome,gecko));
        for (WebDriver webDriver : webDrivers) {
            webDriver.printName();
        }
    }
}
