package lab_12_Homework;

public class TestingAnimal {
    public static void main(String[] args) {
        System.out.println("Tiger: " + new ATiger().speed());
        System.out.println("Dog: " + new ADog().speed());
        System.out.println("Horse: " + new AHorse().speed());

        ATiger weakTiger = new ATiger();
        weakTiger.setSpeedBehavior(new Speed(10));
        System.out.println("Weak Tiger: " + weakTiger.speed());
    }
}
