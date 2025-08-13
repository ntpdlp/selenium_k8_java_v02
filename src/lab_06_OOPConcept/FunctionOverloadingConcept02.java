package lab_06_OOPConcept;

public class FunctionOverloadingConcept02 {

    public static int sum(int...paras){

        int total = 0;
        for (int para : paras) {
            total+=para;
        }

        return total;

    }


    public static float sum(float...paras){

        float total = 0.0f;
        for (float para : paras) {
            total+=para;
        }

        return total;

    }

    public static void main(String[] args) {
        System.out.println("Sum 2 so int: " + sum(2,3));
        System.out.println("Sum 3 so int: " + sum(2,3, 4));
        System.out.println("Sum 4 so int: " + sum(2,3, 4, 5));

        System.out.println("Sum 2 so float: "+ sum(2.5f,3.7f) );
        System.out.println("Sum 3 so float: "+ sum(2.0f,5.0f,3.6f) );
        System.out.println("Sum 4 so float: "+ sum(2.5f,3.7f, 5.9f, 8.4f) );
    }

}
