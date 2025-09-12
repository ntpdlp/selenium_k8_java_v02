package lab_07_BuilderPattern.HouseBuilderV02;

public class TestHouseBuilder {
    public static void main(String[] args) {
        HouseBuilder.Builder builder = new HouseBuilder.Builder();
        HouseBuilder house = builder.setDoors(8)
                                    .setHouseColor("Pink Pink")
                                    .build();

        System.out.println(house.toString());
    }
}
