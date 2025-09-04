package lab_12_StrategyDesignPattern;

public class DuckMallar extends Duck{
    DuckMallar(){
        quackBehavior = new Quack();
    }
}
