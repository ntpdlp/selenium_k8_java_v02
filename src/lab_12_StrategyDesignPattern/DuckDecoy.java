package lab_12_StrategyDesignPattern;

public class DuckDecoy extends Duck{
    DuckDecoy(){
        quackBehavior = new QuackMute();
    }
}
