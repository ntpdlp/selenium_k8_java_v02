package lab_16_serialization_fileIO.java_io_files;

import java.io.*;

public class FileInputStreamLearning {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream =
                    new FileInputStream("./src/lab_16_serialization_fileIO/java_io_files/infor.MD");
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while( (line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("buffer reader");
            throw new RuntimeException(e);
        }
    }
}
