package lab_16_serialization_fileIO.java_io_files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOuputStreamLearning {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("./src/lab_16_serialization_fileIO/java_io_files/infor.MD");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write("hello world\n");
            outputStreamWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
