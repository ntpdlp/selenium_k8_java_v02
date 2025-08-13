package lab_06_OOPConcept;

public class FunctionOverloadingConcept01 {

    /* Closing solution

    public static int sum(int a, int b){
        return (a+b);
    }

    public static int sum(int a, int b, int c){
        return(a+b+c);
    }

    public static int sum(int a, int b, int c, int d){
        return (a + b + c + d);
    }
    */


    //Better Solution: Concept REST PARAMETER
    public static int sum(int... para){
        int total = 0;
        for (int item : para) {
            total += item;
        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println("Sum 2 so: " + sum(2,3));
        System.out.println("Sum 3 so: " + sum(2,3, 4));
        System.out.println("Sum 4 so: " + sum(2,3, 4, 5));

    }

}
