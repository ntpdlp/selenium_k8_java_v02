package lab_03_loop_array;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        boolean flag = true;
        if (number == 2 || number == 1 || number == 0) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return flag;
    }

    public int sumUptoN() {
        //1 + 2 +3 + 4 + ... + N
        int sum = 0;
        String printSum = "";
        for (int i = 1; i <= number; i++) {
            sum += i;
            printSum = printSum + " + " + i;
        }
        System.out.println(printSum);
        return sum;
    }

    public int sumOfDivisors() {
        //6 => 2+3 , except 1, & 6
        int sum = 0;
        String printSum = "";
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                sum += i;
                printSum = printSum + " + " + i;
            }
        }
        System.out.println(printSum);
        return sum;
    }


    public void printANumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d \t", j);
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "number=" + number +
                '}';
    }


    public static void main(String[] args) {

        MyNumber n1 = new MyNumber(6);
        System.out.printf("Sum to %s is %d \n.", n1.toString(), n1.sumUptoN());
        System.out.printf("Sum of devisors %s is %d \n", n1.toString(), n1.sumOfDivisors());
        System.out.printf("Is %s prime? %s \n", n1.toString(), n1.isPrime());

        n1.printANumberTriangle();
    }
}

