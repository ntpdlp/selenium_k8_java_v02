package lab_02_DataType;

import java.math.BigDecimal;


/**
 * Java has 2 classes for BigNumber: BigDecimal, BigInteger
 */

public class BigNumberSimpleInterestCalculator {
    private BigDecimal principle;
    private float interest;

    public BigNumberSimpleInterestCalculator(String principle, String interest) {
        this.principle = new BigDecimal(principle);
        this.interest = Float.valueOf(interest);
    }


    public BigDecimal calculateInterest(int noOfYears) {
        //principle*interest*noOfYears
        BigDecimal interestByYears = new BigDecimal(interest * noOfYears).multiply(principle);
        //return : principle + principle*interest*noOfYears
        return principle.add(interestByYears);
    }


    //test
    public static void main(String[] args) {
        BigNumberSimpleInterestCalculator alex = new BigNumberSimpleInterestCalculator("25464.369", "4.5");
        BigDecimal total = alex.calculateInterest(15);
        System.out.println("Total principle and interest is: " + total);

    }
}
