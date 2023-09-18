package lesson24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class HomeWorkCuntOfLinesWithSubstr {
    public static Integer countOfLinesWithSubstr(String fileName, String subStr) {
        int i =0;
        try (
                Reader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
             i = (int) bufferedReader.lines()
                    .toList()
                    .stream()
                    .filter(s -> s.contains(subStr))
                    .count();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return i;
    }

}
