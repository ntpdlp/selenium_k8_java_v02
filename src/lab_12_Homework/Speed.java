package lab_12_Homework;

import java.security.SecureRandom;

public class Speed implements SpeedBehavior{
    int speedMax;


    public Speed(int speedMax) {
        this.speedMax = speedMax;
    }

    @Override
    public int generateSpeed() {
        return new SecureRandom().nextInt(speedMax);
    }
}
