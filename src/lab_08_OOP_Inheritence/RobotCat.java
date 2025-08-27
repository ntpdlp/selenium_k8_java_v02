package lab_08_OOP_Inheritence;

public class RobotCat {

    private String name;


    public RobotCat(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String charging(){
        return "Charging";
    }
}
