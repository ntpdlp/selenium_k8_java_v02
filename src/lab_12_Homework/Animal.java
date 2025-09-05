package lab_12_Homework;

public abstract class Animal {
    SpeedBehavior speedBehavior;
    protected int maxSpeed;

    Animal(){

    }


    public int speed(){
        int randomSpeed = speedBehavior.generateSpeed();
        while(randomSpeed==0){
            randomSpeed = speedBehavior.generateSpeed();
        }
        return randomSpeed;
   }

    public void setSpeedBehavior(SpeedBehavior speedBehavior) {
        this.speedBehavior = speedBehavior;
    }

}
