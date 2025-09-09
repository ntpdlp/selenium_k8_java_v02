package lab_14_fileInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {

    public static String createAbsoluteFilePath(String fileName) {
        String fileRelativePath = "src/lab_14_fileInput/".concat(fileName);
        String userDir = System.getProperty("user.dir");
        String fileAbsolutePath = userDir.concat("/").concat(fileRelativePath);
        return fileAbsolutePath;
    }

    //use Scanner to read as basic, FileWriter
    public static List<Person> readFile01(String fileAbsolutePath) {
        List<Person> personList = new ArrayList<>();
        File file = new File(fileAbsolutePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                Person p = PersonController.processRawDataLine(currentLine);
                personList.add(p);

            }
            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }

    public static void writeFile01(List<Person> personList, String fileName) {
        if (personList.isEmpty() | fileName.isEmpty()) {
            throw new IllegalArgumentException("[INFO] Person list or fileName can't be empty.");
        }
        try {
            FileWriter fw = new FileWriter(fileName);
            for (Person person : personList) {
                fw.write(PersonController.proceedPersonDataToString(person));
                fw.write("\n");
            }
            fw.close();
            System.out.println("Saving data successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //use FileInputStream, FileOutputStream ...
    public static List<Person> readFile02(String fileName) {
        if (fileName.isEmpty()) {
            throw new IllegalArgumentException("[INFO] fileName can't be empty.");
        }

        List<Person> personList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                Person person = PersonController.processRawDataLine(currentLine);
                personList.add(person);
                currentLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personList;
    }

    public static void writeFile02(List<Person> personList, String fileName) {
        if (personList.isEmpty() | fileName.isEmpty()) {
            throw new IllegalArgumentException("[INFO] Person list or fileName can't be empty.");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            for (Person person : personList) {
                bufferedWriter.write(PersonController.proceedPersonDataToString(person));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Saving data successfully!");
        } catch (IOException e) {

            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
