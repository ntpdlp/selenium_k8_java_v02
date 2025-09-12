package lab_07_BuilderPattern.BurgerInNOut;

public class TestBurgerWithBuilder {
    public static void main(String[] args) {
        BurgerWithBuilder.Builder builder = new BurgerWithBuilder.Builder();
        BurgerWithBuilder burger = builder.setCheese(2).setTomato(false).setOnion(false).build();
        System.out.println(burger.toString());
    }
}
