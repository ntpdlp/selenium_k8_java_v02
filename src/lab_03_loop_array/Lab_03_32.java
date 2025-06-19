package lab_03_loop_array;

public class Lab_03_32 {

    public static void main(String[] args) {

        int[] arr = {1,4,7,2,3,0};
        int min = arr[0];
        int max = arr[0];

        for (int item : arr) {
            if(item < min)
                min = item;
            else if (item > max){
                max = item;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
