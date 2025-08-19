package lab_08_Homework.animal;

import java.security.SecureRandom;

public class Animal {

    public String name;
    public int speedMax;


    Animal(String name, int speedMax){
        this.name = name;
        this.speedMax = new SecureRandom().nextInt(speedMax);

        if( this.speedMax == 0){
            this.speedMax = new SecureRandom().nextInt(speedMax);
        }
    }

    public int getSpeed(){
        return speedMax;
    }

    public String getName(){
        return name;
    }
}
