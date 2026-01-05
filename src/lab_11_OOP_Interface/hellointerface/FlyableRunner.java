package lab_11_OOP_Interface.hellointerface;

interface Flyable{
    int NUMBER_OF_LEGS = 2;//must initialize or catching compile error
    void fly();
}


class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}

class AeroPlane implements Flyable{

    @Override
    public void fly() {
        System.out.println("fly by fuel");
    }
}

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new AeroPlane()};

        for(Flyable flyObj:flyingObjects){
            flyObj.fly();
        }
    }
}
