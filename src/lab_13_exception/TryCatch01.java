package lab_13_exception;

public class TryCatch01 {
    public static void main(String[] args) {
        try{
            int[] nums = {1,2,3};
            System.out.println(nums[10]);
        }catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }
        catch (Exception e){
            System.out.println("[ERR] ...");
            e.printStackTrace();
        }finally {

            System.out.println("finally, closing something remaining...");
        }

    }
}
