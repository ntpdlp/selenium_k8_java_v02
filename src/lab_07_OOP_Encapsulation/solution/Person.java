package lab_07_OOP_Encapsulation.solution;

public class Person {
    //private access modifier: ko muon data bi truy cap tu ben ngoai
    private String name;
    private int age;

    @Override
    public String toString() {
        return String.format("name: %s, age: %d", name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 1){
            age=1;
            throw new IllegalArgumentException("Age is minimum at least from 1, please");
        }
        this.age = age;
    }
}
