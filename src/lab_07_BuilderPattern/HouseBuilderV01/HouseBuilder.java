package lab_07_BuilderPattern.HouseBuilderV01;

public class HouseBuilder {
    //1.properties
    private String houseColor = "White";
    private String roofColor = "Red";
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
        return "HouseBuilder{" +
                "houseColor='" + houseColor + '\'' +
                ", roofColor='" + roofColor + '\'' +
                ", doors=" + doors +
                ", windows=" + windows +
                '}';
    }

    //3.subclass with the same properties BUT for SET only
    public static class Builder{
        //properties
        private String houseColor = "White";
        private String roofColor = "Red";
        private int doors = 2;
        private int windows = 5;

        public String getHouseColor() {
            return houseColor;
        }

        public void setHouseColor(String houseColor) {
            this.houseColor = houseColor;
        }

        public void setRoofColor(String roofColor) {
            this.roofColor = roofColor;
        }

        public void setDoors(int doors) {
            this.doors = doors;
        }

        public void setWindows(int windows) {
            this.windows = windows;
        }

        public HouseBuilder build(){
            return new HouseBuilder(this);
        }
    }
}
