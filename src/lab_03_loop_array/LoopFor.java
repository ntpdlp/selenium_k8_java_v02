package lab_03_loop_array;

public class LoopFor {

    public static void main(String[] args) {

        /*
        //infinitive loop: since default condition = true
        for(;;){
            System.out.println("infinitive loop");
        }
        */


        for (byte i = 0; i < 5; i--) {
            System.out.println(i); //will stop at -128
        }

    }
}
