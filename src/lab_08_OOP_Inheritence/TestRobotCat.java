package lab_08_OOP_Inheritence;

public class TestRobotCat {

    public static void main(String[] args) {

        RobotCat batteryRobotCat = new BatteryRobotCat("battery");
        RobotCat solarRobotCat = new SolarRobotCat("solar");

        //use the same parent functions
        batteryRobotCat.setName("Battery Robot Cat");
        solarRobotCat.setName("Solar Robot Cat");


        //use the override functions from subclass
        System.out.println(batteryRobotCat.charging());
        System.out.println(solarRobotCat.charging());
    }
}
