package lab_12_StrategyDesignPattern;

public class DuckBaby extends Duck{

    DuckBaby(){
        quackBehavior = new QuackSqeak();
    }

    @Override
    public void display() {
        System.out.println("I am a baby duck, making sound sqeak sqeak");
    }
}
