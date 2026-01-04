package lab_07_BuilderPattern.HouseBuilderV02;

public class HouseBuilder {
    private String houseColor = "White";
    private String roofColor = "red";
    private int doors = 2;
    private int windows = 5;

    protected HouseBuilder(Builder builder){
        this.houseColor = builder.houseColor;
        this.roofColor = builder.roofColor;
        this.doors = builder.doors;
        this.windows = builder.windows;

    }

    @Override
    public String toString() {
        return String.format("houseColor: %s, roofColor: %s, doors: %d, windows: %d",
                houseColor,roofColor,doors,windows);
    }

    public static class Builder{
        private String houseColor = "White";
        private String roofColor = "red";
        private int doors = 2;
        private int windows = 5;

        //WRITE ONLY
        public Builder setHouseColor(String houseColor) {
            this.houseColor = houseColor;
            return this;
        }

        public Builder setRoofColor(String roofColor) {
            this.roofColor = roofColor;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder build(){
            return new HouseBuilder(this);
        }
    }
}
