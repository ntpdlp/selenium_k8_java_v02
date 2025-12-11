package lab_16_serialization_fileIO.serializationErrorSkip;

import java.io.*;

public class Pond implements Serializable {
    transient private Duck duck = new Duck(); //instance variable from class missing implements Serializable

    public static void main(String[] args) {
        Pond pond = new Pond();

        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("./src/lab_16_serialization_fileIO/serializationErrorSkip/testPond.md");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(pond);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Duck{

}
