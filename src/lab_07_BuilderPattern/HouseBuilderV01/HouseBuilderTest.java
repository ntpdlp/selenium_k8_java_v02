package lab_07_BuilderPattern.HouseBuilderV01;

public class HouseBuilderTest {
    public static void main(String[] args) {
        HouseBuilder.Builder builder = new HouseBuilder.Builder();
        builder.setHouseColor("Blue");
        builder.setRoofColor("Purple");
        builder.setDoors(6);
        builder.setWindows(10);
        HouseBuilder houseBuilder = builder.build();
        System.out.println(houseBuilder.toString());
    }
}
