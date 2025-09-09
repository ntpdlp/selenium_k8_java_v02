package lab_14_fileInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataFactory {
    public static void readFile(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {
            String currentLine = bufferedReader.readLine();
            while(currentLine != null)
            {
                Person person = processRawDataLine(currentLine);
                System.out.println(person.toString());
                currentLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String fileRelativePath = "src/lab_14_fileInput/testData.txt";
        String userDir = System.getProperty("user.dir");
        String fileAbsolutePath = userDir.concat("/").concat(fileRelativePath);
        System.out.println(fileAbsolutePath);

        //version with create simple File, then use Scanner to read data from that file
        System.out.println(readFileSimple(fileAbsolutePath));

        //version with InputStreamFile
        readFile(fileAbsolutePath);

    }

    public static List<Person> readFileSimple(String fileAbsolutePath)
    {
        List<Person> personList = new ArrayList<>();
        File file = new File(fileAbsolutePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                Person p = processRawDataLine(currentLine);
                personList.add(p);

            }
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

    public static Person processRawDataLine(String dataLine) {
        String[] data;
        try {
            data = dataLine.split("[;]");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            long salary = Long.parseLong(data[2]);
            return new Person(name, age, salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
