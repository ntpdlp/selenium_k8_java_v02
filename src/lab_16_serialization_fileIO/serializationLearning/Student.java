package lab_16_serialization_fileIO.serializationLearning;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
