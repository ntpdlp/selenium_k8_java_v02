package lab_16_serialization_fileIO.serializationLearning;

import java.io.*;

public class TestSerializationStudent{
    public static void main(String[] args) {
        ObjectOutputStream outputStream = null;
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("./src/lab_16_serialization_fileIO/serializationLearning/student.md");
            outputStream = new ObjectOutputStream(fileOutputStream);
            Student jak = new Student("Jak",18);
            Student mike = new Student("Mike",20);
            outputStream.writeObject(jak);
            outputStream.writeObject(mike);
            System.out.println("writing completely!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{ //BEST PRACTICE: finally ALWAYS RUN, ensure to close 'chain stream' at the end !
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
