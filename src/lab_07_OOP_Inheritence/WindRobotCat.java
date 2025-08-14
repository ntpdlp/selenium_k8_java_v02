package lab_07_OOP_Inheritence;

public class WindRobotCat extends RobotCat {

    public WindRobotCat(String name){
        super(name);
    }

    @Override
    public String charging(){

        return super.charging().concat(" by Wind.");
    }

}
