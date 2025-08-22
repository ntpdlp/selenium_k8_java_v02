package lab_07_OOP_Encapsulation.solution;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Phuong");
        p.setAge(-18);//will create IllegalArgumentException that we added in method setAge()
        p.setAge(5);
        System.out.println(p.toString());
    }
}
