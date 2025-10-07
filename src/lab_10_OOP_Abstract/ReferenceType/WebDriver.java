package lab_10_OOP_Abstract.ReferenceType;

abstract public class WebDriver {
    protected String name;

    WebDriver(){}

    abstract public WebDriver showYourself();

    public void printName(){
        System.out.println(name);
    }
}
