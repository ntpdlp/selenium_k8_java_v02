package lab_08_StaticFinalEnum.finalStatic;


enum EnumSizes {SMALL, MEDIUM, LARGE};
enum EnumCurrency {US, UK, VN}

public class LabelConstants {

    //final static == constants
    public final static int SLEEPING_TIME = 200;
    public final static int WAITING_TIME = 100;


    public static void main(String[] args) {

        System.out.println("Waiting time: " + LabelConstants.WAITING_TIME);

        System.out.println(EnumSizes.LARGE);


        displayCurrency(EnumCurrency.UK);
    }


    public static void displayCurrency(EnumCurrency currency){
        switch (currency){
            case US:
                System.out.println("United State Dollar");
                break;
            case UK:
                System.out.println("England Dollar");
                break;
            case VN:
                System.out.println("Vietnam Dong");
                break;
            default:
                System.out.println("Do not support currency");
        }
    }
}
