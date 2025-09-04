package lab_12_StrategyDesignPattern;

public class DuckController {

    public void performQuack(Duck duck){
        duck.quack();
    }

    public static void main(String[] args) {
        new DuckController().performQuack(new DuckMallar()); //Quack Quack
        new DuckController().performQuack(new DuckBaby()); // Sqeak Sqeak
        new DuckController().performQuack(new DuckDecoy()); // No Quack


        //Try to set behavior
        Duck decoyDuck = new DuckDecoy();
        decoyDuck.setQuackBehavior(new QuackSqeak());
        decoyDuck.quack(); //expected: sqeak sqeak

    }
}
