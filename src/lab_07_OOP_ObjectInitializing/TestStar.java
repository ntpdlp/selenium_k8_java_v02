package lab_07_OOP_ObjectInitializing;

public class TestStar {

    public static void main(String[] args) {
        Star starx = new Star();
        Star stary = starx;

        starx.setName("ABC");
        System.out.println(stary.getName()); //ABC

        stary.setName("updated_ABC");
        System.out.println(starx.getName()); //updated_ABC

        //Concept:
        //Problem: why update y -> make x update also?
        //Answer:
        //because we just create only 1 object Star(), both x & y point to the same reference variable.
        //when updating x's value => cause y's update accordingly and vice versa
        //How to solve this problem ??

    }
}
