package lab_12_Homework;

public class ADog extends Animal{

    public ADog() {
        maxSpeed = 60;
        speedBehavior = new Speed(maxSpeed);
    }
}
