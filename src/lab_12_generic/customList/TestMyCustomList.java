package lab_12_generic.customList;

public class TestMyCustomList {
    public static void main(String[] args) {
        MyCustomList<String> fruit = new MyCustomList<>();
        fruit.addElement("Apple");
        fruit.addElement("Banana");
        System.out.println(fruit.toString());

        MyCustomList<Integer> nums = new MyCustomList<>();
        nums.addElement(Integer.valueOf(50));
        nums.addElement(Integer.valueOf(60));
        System.out.println(nums.toString());

    }
}
