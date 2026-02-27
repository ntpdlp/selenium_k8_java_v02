package lab_17_java_tips;

public class StaticMethodStaticVariable {
    int non_static_int = 4;
    static int static_int = 5;

    public static void static_sub_function(){}
    public void normal_function(){}

    static void static_function(){
        System.out.println("In static function: ONLY able to call STATIC-variable OR STATIC-function");
        System.out.println(static_int);
        //System.out.println(non_static_int); //Compile Error here....

        //calling static function only
        static_sub_function();
        //normal_function(); //Err: non-static method can't be referenced in a static context
    }


}
