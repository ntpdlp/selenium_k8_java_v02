package lab_16_serialization_fileIO.serializationLearning;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestDeserialization {
    public static void main(String[] args) {
        ObjectInputStream reader = null;
        try {
            FileInputStream binaryFile =
                    new FileInputStream("./src/lab_16_serialization_fileIO/serializationLearning/student.md");
            reader = new ObjectInputStream(binaryFile);
            Object student;
            while((student=reader.readObject()) != null){
                Student aStudent = (Student) student;
                System.out.println(aStudent);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) {
            System.out.println(">>Done reading data from file.<<");;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
