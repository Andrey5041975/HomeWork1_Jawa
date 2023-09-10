package lesson22;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

/*
 1 уровень сложности: 1. Дан файл (names.txt) со списком имен на выбор, некоторые имена повторяются.

=== names.txt  начало ===
Max Alexander Lena
Sveta
Alexander Dima Lena Max
Sveta Pavel
===names.txt окончание====


Написать метод, который вернет количество вхождений каждого из имен в файл



Есть текстовой файл с произовльным текстом text.txt
Найдите самое длинное слово (слова отделяются между собой пробелами).

 */
public class Lesson22_HomeWork_10_09_23 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> namesList = new ArrayList<>();

        List<String> textList = new ArrayList<>();

        try(
                Reader reader = new FileReader("names.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);

                Reader readerTxt = new FileReader("text.txt");
                BufferedReader bufferedReaderTxt = new BufferedReader(readerTxt);
                )

        {

            System.out.println("Задание 1");

//            String sP;
//            System.out.println("Вывод на печать содержимого файла");
//            while ((sP=bufferedReader.readLine())!= null)
//            {
//                System.out.println(sP);
//            }
            //bufferedReader.close();
            //bufferedReader.reset();

            String line = bufferedReader.readLine();
            while (line != null)
            {
                // разобьем строку по " " на куски
                String[] t = line.split(" ");
                // из кусков соберем
                namesList.addAll(Arrays.asList(t));
                // добавим в список
                line = bufferedReader.readLine();
            }


            String lineTxt = bufferedReaderTxt.readLine();
            while (lineTxt != null)
            {
                String[] s = lineTxt.split(" ");
                textList.addAll(Arrays.asList(s));
                lineTxt = bufferedReaderTxt.readLine();
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Список namesList, сформированный из файла с именами " + '\n' +namesList);
        System.out.println();
        System.out.println("Способ 1 используя stream: ");
        System.out.println(namesList.stream()
                      .collect(Collectors.groupingBy(n-> n, Collectors.counting()))

        );

        System.out.println('\n');
        System.out.println("Способ 2 используя map и forEach ");
        Map<String, Integer> myMap = new HashMap<>();
        for (String n: namesList)
        {
            myMap.merge(n, 1, Integer::sum);
//            if (value != null){
//                myMap.put(n, value + 1);
//            }
//            else {
//                myMap.put(n, 1);
//            }
        }
        System.out.println("Вывод на печать myMap имя =  " + myMap+ '\n');

        System.out.println("Задание 2");
        System.out.println("Список слов из файла " +  textList);
        String sTemp ="";
        for (String s : textList)
        {
            if (s.length() > sTemp.length()) {sTemp = s;}

        }

        System.out.println("Самое длинное слово 1 метод - for: " + sTemp + '\n');

//        OptionalInt i = textList.stream()
//                .mapToInt(String::length)
//                .max();
//        System.out.println("Самое длинное слово 2 метод " + i);

        System.out.println("Самое длинное слово 2 метод - stream");
        System.out.println(textList.stream()
                .max(Comparator.comparingInt(String::length)));
        }
}
