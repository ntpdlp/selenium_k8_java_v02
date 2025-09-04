package lab_12_StrategyDesignPattern;

public class Duck {
    protected QuackBehavior quackBehavior;

    public void quack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
