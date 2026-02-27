package lab_17_java_tips;

public class PublicStaticFinalConstant {
    public static final int HOURS_IN_DAY = 24;
    public static final int MINS_IN_HOUR = 60;
    public static final int SECONDS_IN_MINS = 60;

    public static void main(String[] args) {
        System.out.println("Seconds in a day is: " + HOURS_IN_DAY*MINS_IN_HOUR*SECONDS_IN_MINS);
    }
}
