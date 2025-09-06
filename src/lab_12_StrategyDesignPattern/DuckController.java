package lab_12_StrategyDesignPattern;

import java.util.Arrays;
import java.util.List;

public class DuckController {


    public static void main(String[] args) {
        Duck babyDuck = new DuckBaby();
        Duck mallardDuck = new DuckMallar();
        Duck decoyDuck = new DuckDecoy();

        List<Duck> duckList = Arrays.asList(babyDuck,mallardDuck,decoyDuck);
        duckList.forEach(Duck::performQuack);

        for (Duck duck : duckList) {
            duck.performQuack();
        }


        //Try to set behavior
        Duck decoyDuck02 = new DuckDecoy();
        decoyDuck02.setQuackBehavior(new QuackSqeak());
        decoyDuck02.performQuack(); //expected: sqeak sqeak

    }
}
