package lab_02_Operator;

import java.util.Scanner;

public class lab02_21_if_BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap height(m): ");
        float height = scanner.nextFloat();
        System.out.println("nhap weight(kg): ");
        float weight = scanner.nextFloat();
        float bmi = weight/(height * 2);
        System.out.printf("bmi: %f \n",bmi);

        if (bmi <= 18.5){
            System.out.println("Underweight");
        } else if (bmi<=24.9) {
            System.out.println("Normal weight");
        } else if (bmi <=29.9) {
            System.out.println("overweight");
        }else{
            System.out.println("obesity");
        }
    }
}



/*

## Lab 2.1:
Get input from user about height(m) and weight(kg) then calculate BMI
- Underweight = <18.5
- Normal weight = 18.5 – 24.9
- Overweight = 25–29.9
- Obesity = BMI of 30 or greater

```
BMI = weight / (height x 2)
```

 */