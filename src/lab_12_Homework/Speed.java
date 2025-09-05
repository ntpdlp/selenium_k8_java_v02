package lab_12_Homework;

import java.security.SecureRandom;

public class Speed implements SpeedBehavior{
    int assignedSpeed;

    Speed(int assignedSpeed){
        this.assignedSpeed = assignedSpeed;
    }

    @Override
    public int generateSpeed() {
        return new SecureRandom().nextInt(assignedSpeed);
    }
}
