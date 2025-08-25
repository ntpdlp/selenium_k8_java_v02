package lab_09_homework;

import lab_07_OOP_Encapsulation.BurgerInNOut.BurgerWithBuilder;
import lab_08_Homework.animal.AnimalController;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    private String name = "noname";
    private int speed = 1;
    private boolean flyable = false;

    protected AnimalWithBuilder(Builder builder){
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    //Builder: WRITE ONLY
    public static class Builder{
        private String name = "noname";
        private int speed = 1;
        private boolean flyable = false;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speedMax) {
            int speedRandom = new SecureRandom().nextInt(speedMax);
            this.speed = speedRandom;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }


    }

}
