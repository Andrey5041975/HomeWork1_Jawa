package lesson24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class HomeWorkCountOfLines {
    public static Integer countOfLines(String fileName) {
        int i = 0;
        try (
                Reader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            i =  (int) bufferedReader.lines().count();
            //return i;
            //(int) bufferedReader.lines().count();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
       return i;
    }
}
