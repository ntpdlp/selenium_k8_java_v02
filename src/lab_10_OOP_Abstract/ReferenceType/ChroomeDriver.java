package lab_10_OOP_Abstract.ReferenceType;

public class ChroomeDriver extends WebDriver{

    ChroomeDriver(){
        super();
        name = "Iam ChromeDriver hjhj";
    }

    @Override
    public WebDriver showYourself() {
        return new ChroomeDriver();
    }

}
