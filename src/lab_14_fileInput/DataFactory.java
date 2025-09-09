package lab_14_fileInput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataFactory {



    public static void main(String[] args) {
        String fileAbsolutePath = FileController.createAbsoluteFilePath("testData.txt");
        System.out.println(fileAbsolutePath);

        //read from a file
        System.out.println(FileController.readFile01(fileAbsolutePath)); //use Scanner
        System.out.println(FileController.readFile02(fileAbsolutePath)); //use InputStreamReader

        //write data to a text file
        Person tun01 = new Person("tun 01",40,60000);
        Person tun02 = new Person("tun 02",20,30000);
        Person tun03 = new Person("tun 03",35,70000);
        List<Person> personList = Arrays.asList(tun03,tun02,tun01);
        String fileAbsolutePath02 = FileController.createAbsoluteFilePath("outputFile.txt");
        //FileController.writeFile01(personList,fileAbsolutePath02);
        FileController.writeFile02(personList,fileAbsolutePath02);

    }




}
