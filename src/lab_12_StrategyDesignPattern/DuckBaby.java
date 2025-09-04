package lab_12_StrategyDesignPattern;

public class DuckBaby extends Duck{

    DuckBaby(){
        quackBehavior = new QuackSqeak();
    }
}
