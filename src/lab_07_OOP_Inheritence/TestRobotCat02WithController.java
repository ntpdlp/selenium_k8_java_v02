package lab_07_OOP_Inheritence;

import java.util.Arrays;

public class TestRobotCat02WithController {

    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat("BatteryCat");
        RobotCat solarRobotCat = new SolarRobotCat("SolarCat");
        RobotCat windRobotCat = new WindRobotCat("WindCat");

        RobotCatController robotCatController = new RobotCatController();
        robotCatController.charging(Arrays.asList(batteryRobotCat,solarRobotCat,windRobotCat));

    }
}
