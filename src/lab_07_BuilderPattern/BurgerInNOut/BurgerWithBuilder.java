package lab_07_BuilderPattern.BurgerInNOut;

public class BurgerWithBuilder {

    private String protein = "beef";
    private boolean salad = true; //yes
    private boolean onion = true;
    private boolean tomato = true;
    private int cheese = 1;


    protected BurgerWithBuilder(Builder builder){
      this.protein = builder.protein;
      this.salad = builder.salad;
      this.onion = builder.onion;
      this.tomato = builder.tomato;
      this.cheese = builder.cheese;

    }

    ////////////////////////////////////////////////////////////////
    //back-end kitchen:
    //READ ONLY
    public String getProtein() {
        return protein;
    }

    public boolean isSalad() {
        return salad;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isTomato() {
        return tomato;
    }

    public int getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        return "BurgerWithBuilder{" +
                "protein='" + protein + '\'' +
                ", salad=" + salad +
                ", onion=" + onion +
                ", tomato=" + tomato +
                ", cheese=" + cheese +
                '}';
    }

    ////////////////////////////////////////////////////////////////
    //font customer service to get order
    public static class Builder{
        private String protein = "beef";
        private boolean salad = true; //yes
        private boolean onion = true;
        private boolean tomato = true;
        private int cheese = 1;

        //Write Only
        public Builder setProtein(String protein) {
            this.protein = protein;
            return this;
        }

        public Builder setSalad(boolean salad) {
            this.salad = salad;
            return this;
        }

        public Builder setOnion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public Builder setTomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder setCheese(int cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerWithBuilder build(){
            return new BurgerWithBuilder(this);
        }
    }
}
