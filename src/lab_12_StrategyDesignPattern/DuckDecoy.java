package lab_12_StrategyDesignPattern;

public class DuckDecoy extends Duck{
    DuckDecoy(){
        quackBehavior = new QuackMute();
    }

    @Override
    public void display() {
        System.out.println("I can not make sound");
    }
}
