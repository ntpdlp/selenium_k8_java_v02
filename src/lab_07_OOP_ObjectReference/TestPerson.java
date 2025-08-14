package lab_07_OOP_ObjectReference;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main(String[] args) {

        //Scenario 1: add duplicated => will point to the same reference address
        Person teo = new Person("teo",18);

        //add 'teo' 2 times
        List<Person> persons = new ArrayList<>();
        persons.add(teo);
        persons.add(teo);

        System.out.println(persons); //[Person{name='teo', age=18}, Person{name='teo', age=18}]

        //update just 1 teo
        persons.get(1).setName("tun");
        System.out.println(persons);//[Person{name='tun', age=18}, Person{name='tun', age=18}]

        //???WHY??? since persons[0], or persons[1] points to the same reference address.

    }
}
