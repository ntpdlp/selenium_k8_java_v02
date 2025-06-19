package lab_03_loop_array;

public class Lab_03_34 {

    public static void main(String[] args) {

        int[] arr_01 = {1,12,16,28,34};
        int[] arr_02 = {1,13,16,27,99};
        int new_length = arr_01.length + arr_02.length;
        int[] arr_output = new int[new_length];

        int count = 0;
        int index_01 = 0;
        int index_02 = 0;
        while(count < new_length && index_01 < arr_01.length && index_02 < arr_02.length){
            if(arr_01[index_01] <= arr_02[index_02]){
                arr_output[count] = arr_01[index_01];
                index_01 +=1;
            }else{
                arr_output[count] = arr_01[index_02];
                index_02 +=1;
            }
            count +=1;
        }

        //neu arr_01 het truoc, phan con lai cua arr_02 se xep vao output
        if (index_01 == arr_01.length){
            for (int index = index_02; index < arr_02.length; index++) {
                arr_output[count] = arr_02[index];
                count +=1;
            }
        }

        //neu arr_02 het truoc, phan con lai cua arr_01 se xep vao output
        if (index_02 == arr_02.length){
            for (int index = index_01; index < arr_01.length; index++) {
                arr_output[count] = arr_01[index];
                count +=1;
            }
        }

        for (int i : arr_output) {
            System.out.printf("%d \t",i);
        }

    }




}
