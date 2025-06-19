package lab_03_loop_array;

public class Lab_03_33 {

    public static void main(String[] args) {

        int[] arr = {12,34,1,16,28,79,24,12};
        for (int i = 0; i < arr.length; i++) {
            int min_pos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    min_pos = j;
                }
            }

            //swap value at position: i, min_pos
            int temp = arr[i];
            arr[i] = arr[min_pos];
            arr[min_pos] = temp;
        }

        for (int element : arr) {
            System.out.printf("%d\t",element);
        }
    }
}
