package lab_07_OOP_Inheritence;

import java.util.List;

public class RobotCatController {


    public void charging(List<RobotCat> robotCats)
    {
        for (RobotCat robotCat : robotCats) {
            System.out.println(robotCat.charging());
        }

    }
}
