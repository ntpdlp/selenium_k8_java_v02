package lab_16_serialization_fileIO.serializationLearning;

import java.io.*;

public class TestDeserialization {
    public static void main(String[] args) {
        ObjectInputStream reader = null;
        try {
            FileInputStream binaryFile =
                    new FileInputStream("./src/lab_16_serialization_fileIO/serializationLearning/student.md");
            reader = new ObjectInputStream(binaryFile);
            Object temp;
            while((temp = reader.readObject()) != null){
                Student student = (Student) temp;
                System.out.println(student.toString());
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
