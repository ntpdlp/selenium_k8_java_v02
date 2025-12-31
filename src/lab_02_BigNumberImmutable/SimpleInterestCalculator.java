package lab_02_BigNumberImmutable;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
    private BigDecimal principle;
    private float interest;

    public SimpleInterestCalculator(String principle, String interest){
        this.principle = new BigDecimal(principle);
        this.interest = Float.valueOf(interest);
    }


    public BigDecimal calculateInterest(int noOfYears){
        //principle*interest*noOfYears
        BigDecimal interestByYears = new BigDecimal(interest*noOfYears).multiply(principle);
        //return : principle + principle*interest*noOfYears
        return principle.add(interestByYears);
    }


    //test
    public static void main(String[] args) {
        SimpleInterestCalculator alex = new SimpleInterestCalculator("25464.369","4.5");
        BigDecimal total = alex.calculateInterest(15);
        System.out.println("Total principle and interest is: " + total);
    }
}
