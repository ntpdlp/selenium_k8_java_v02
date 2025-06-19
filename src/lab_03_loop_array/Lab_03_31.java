package lab_03_loop_array;

public class Lab_03_31 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,9,10};

        int demChan = 0;
        int demLe = 0;
        for (int number : arr) {
            if(number % 2 == 0){
                demChan ++;
            }else{
                demLe ++;
            }
        }
        System.out.println("So chan : " + demChan);
        System.out.println("So le : " + demLe);
    }
}
