package lab_10_OOP_Abstract.ReferenceType;

public class GeckoFireFoxDriver extends WebDriver{

    GeckoFireFoxDriver(){
        super();
        name = "Iam Firefox Gecko driver hjhj";
    }

    @Override
    public WebDriver showYourself() {
        System.out.println(name);
        return new GeckoFireFoxDriver();
    }
}
