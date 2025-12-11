package lab_16_serialization_fileIO.serializationLearning;

import java.io.*;

public class TestSerializationStudent{
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("./src/lab_16_serialization_fileIO/serializationLearning/student.md");
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(fileOutputStream);
            Student jak = new Student("Jak",18);
            outputStream.writeObject(jak);
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
