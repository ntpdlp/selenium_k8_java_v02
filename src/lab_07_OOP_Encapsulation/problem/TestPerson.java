package lab_07_OOP_Encapsulation.problem;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Vo";
        person.age = -18; //Problem: ko muon data bi truc tiep thay doi tu ben ngoai => muon data hidden
        System.out.println(person.toString());
    }
}
