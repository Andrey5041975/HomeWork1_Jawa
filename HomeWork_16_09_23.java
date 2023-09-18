package lesson24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

import static lesson24.HomeWorkCountOfLines.countOfLines;
import static lesson24.HomeWorkCuntOfLinesWithSubstr.countOfLinesWithSubstr;

/*
 1 уровень сложности:
 1. Напишите функцию, которая считает количество строк в передаваемом в нее в виде параметра текстовом файле
 2. В функцию передаются имя файла и подстрока. Посчитайте количество строк текстового файла, содержащие эту подстроку.
 3*. Доделайте E_Concordance
*/

public class HomeWork_16_09_23 {

    public static void main(String[] args) {

        System.out.println("В файле proFedota.txt " + countOfLines("proFedota.txt") + " строк");
        System.out.println("Подстрока 'аглицкий посол' в файле proFedota.txt встречается " + countOfLinesWithSubstr("proFedota.txt", "аглицкий посол") + " раза");
    }
}