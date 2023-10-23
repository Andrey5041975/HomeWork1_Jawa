package homeWorks.hw_2_08_23.lesson30_06_10_23;

import lesson6.list.MyList;

import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.Collection;


public class Hw_06_10_23 {
    private static int rTime1;
    private static int rTime2;

    public static void main(String[] args) {
        System.out.println("Task 1" );
        List<Integer> la = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String>  daysOfWeek = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
//        System.out.println(a);
        System.out.println("Работа шаблонной функции: " + getElements(la, 1,2,3));
        System.out.println("Работа шаблонной функции: " + getElements(daysOfWeek, 1,2,6));
        System.out.println();

        /*
        2. Создайте LocalDateTime с какой-нибудь датой, например с днем рождения
        Воспользуйтесь DateTimeFormatter, чтобы вывести эту дату в виде
        01 January 1970, Thursday
        Выведите то-же самое, но по-французски
        01 janvier 1970, jeudi
        */


        System.out.println("Task 2" );
        LocalDateTime ldt = LocalDateTime.of(1975, 07, 24, 22,45);

        System.out.println( "DateTimeFormatter.ofPattern(\"dd MMMM yyyy EEEE \"), Locale.US : " +
                ldt.format(
                        DateTimeFormatter.ofPattern(" dd MMMM yyyy EEEE", Locale.US)  //"01 January 1970, Thursday"
                ));

        System.out.println( "DateTimeFormatter.ofPattern(\"dd MMMM yyyy EEEE \"), Locale.FRANCE: " +
                ldt.format(
                        DateTimeFormatter.ofPattern(" dd MMMM yyyy EEEE", Locale.FRANCE)  //"01 January 1970, Thursday"
                ));

        System.out.println( "DateTimeFormatter.ofPattern(\"dd MMMM yyyy EEEE \"), Locale.CHINA: " +
                ldt.format(
                        DateTimeFormatter.ofPattern(" dd MMMM yyyy EEEE", Locale.CHINA)  //"01 January 1970, Thursday"
                ));

       Locale lru =  new Locale("Russia", "Russia");
        System.out.println( "DateTimeFormatter.ofPattern(\"dd MMMM yyyy EEEE \"), Locale.RUSSIA " +
                ldt.format(
                        DateTimeFormatter.ofPattern(" dd MMMM yyyy EEEE", lru)  //"01 January 1970, Thursday"
                ));

        /*
         3. Создайте Instant из строки "2023-07-13T19:34:00.00Z"
        Переведите этот момент времени во временную зону "Pacific/Honolulu" и распечатайте
         */

        System.out.println();
        System.out.println("Task 3");
        Instant now = Instant.now();
        System.out.println("Instant now:      " + now);
        Instant tm = Instant.parse("2023-07-13T19:34:00.00Z");
        System.out.println("Instant tm        " + tm);
        System.out.println("Pacific/Honolulu: " + tm.atZone(ZoneId.of("Pacific/Honolulu")));

        System.out.println();
        System.out.println("Task 4");
        Thread t1 = new Thread(() -> {
            rTime1 = waitRandom();
            System.out.println("Время ожидания t1 " + rTime1);
        });
//        Thread t1 = new Thread()
//        {
//            @Override
//            public void run() {
//
//                rTime1 = waitRandom();
//                System.out.println("Время ожидания t1 " + rTime1);
//            }
//        };

        Thread t2 = new Thread(() -> {
            rTime2 = waitRandom();
            System.out.println("Время ожидания t2 " + rTime2);
        });
//        Thread t2 = new Thread()
//        {
//            @Override
//            public void run() {
//                rTime2 = waitRandom();
//                System.out.println("Время ожидания t2 " + rTime2);
//            }
//        };
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e){ /* */ }

        System.out.println("Время ожидания t1 + t2: " + rTime1 + " + " + rTime2 + "= " + ( rTime1 + rTime2));
    } //main



    /*
     1.уровень сложности:
         1. Напишите шаблонную функцию, которая принимает на вход список и varargs из целых.
         Нужно вернуть коллекцию из элементов, номера которых и передаются в виде varargs
         public static  Collection getElements(List list, int … elements)
     */

    public static  <T> Collection<T> getElements(List<T> list, int ... elements)
    {
        List<T> lst = new ArrayList<>();
        for(int i = 0; i < elements.length; i++)
        {
            if(elements[i] < list.size())
                lst.add(list.get(elements[i]));
        }
        return lst;
    }
    /*


        *4. Создайте функцию, ожидающую рандомное время от 0 до 1000 мс и возвращающую это время в качестве результата public int wait()
        Запустите эту функцию в двух потоках, в их методе run сохраните результат выполнения этой функции в статические переменные класса.
        В main запустите потоки и распечатайте сумму значений этих статических переменных.

 */

    public static int waitRandom() {
        Random tw = new Random();
        int tmRand = tw.nextInt(1000);
        try {
            Thread.sleep(tmRand);
        } catch (InterruptedException e) {
            ;
        }
        return tmRand;
    }
}
