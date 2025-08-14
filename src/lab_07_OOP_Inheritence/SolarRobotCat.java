package lab_07_OOP_Inheritence;

public class SolarRobotCat extends RobotCat{

    public SolarRobotCat(String name){
        super(name);
    }


    @Override
    public String charging(){
        return super.charging().concat(" by using Solar.");
    }
}
