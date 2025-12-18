package lab_16_serialization_fileIO.serializationLearning;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -6157283002164137071L;
    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
