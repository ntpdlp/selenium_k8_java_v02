package lab_14_fileInput;

import java.io.*;
import java.util.Scanner;

public class DataFactory {

    public static void readFile(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String fileRelativePath = "src/lab_14_fileInput/testData.txt";
        String userDir = System.getProperty("user.dir");
        String fileAbsolutePath = userDir.concat("/").concat(fileRelativePath);
        System.out.println(fileAbsolutePath);
        readFileSimple(fileAbsolutePath);

    }

    public static void readFileSimple(String fileAbsolutePath) {
        File file = new File(fileAbsolutePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                Person p = processRawDataLine(currentLine);
                System.out.println(p.toString());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Person processRawDataLine(String dataLine) {
        String[] data = null;
        Person p = null;
        try {
            data = dataLine.split("[;]");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            long salary = Long.parseLong(data[2]);
            p = new Person(name, age, salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
}
