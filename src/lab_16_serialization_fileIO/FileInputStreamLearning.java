package lab_16_serialization_fileIO;

import java.io.*;

public class FileInputStreamLearning {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream =
                    new FileInputStream("./src/lab_16_serialization_fileIO/infor.MD");
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while( line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("buffer reader");
            throw new RuntimeException(e);
        }
    }
}
