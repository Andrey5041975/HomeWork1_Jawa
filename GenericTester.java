package lesson28.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GenericTester {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Misha");
        //names.add(4);

        List something = new ArrayList<>(); //Object
        something.add("Misha");
        something.add(123);
        String name = (String) something.get(0);
        //String anothernAME = (String) something.get(1);
        debug(name);
        debug(123);
        log(name);
        log(123);

        String [] countries = {"Cuba", "Venezuela", "Salvador", "Albania"};
        System.out.println(firstElement(countries));

        System.out.println(Arrays.toString(countries));
        swap(countries,1,2);
        System.out.println(Arrays.toString(countries));
        Pair<String, Integer> masha = new PairImpl<>("Masha", 24);
        System.out.println(firstAndLast(countries));
        System.out.println("fromArrayToList(countries) :" + fromArrayToList(countries));

        System.out.println(
                fromArrayToList(
                        countries,
                        s -> s.contains("l"),
                        s -> s.toUpperCase()
                )

        );

        System.out.println("listFilter :" +
                listFilter(Arrays.asList(countries),
                        n-> n.contains("V")
                        )
        );

        Pair<String, Integer> pp1 = new PairImpl<> ("A", 6);
        Pair<String, Integer> pp2 = new PairImpl<> ("A", 6);

        Pair<String, Integer> pp3 = new PairImpl<> ("ABC", 66);
        Pair<String, Integer> pp4 = new PairImpl<> ("CBD", 6);

        Pair<String, Integer> pp5 = new PairImpl<> ("ABC", 66);
        Pair<String, Integer> pp6 = new PairImpl<> ("ABC", 7);

        System.out.println(pp1.toString() +  " " + pp2.toString() + " " + equals(pp1, pp2));
        System.out.println(pp3.toString() +  " " + pp4.toString() + " " + equals(pp3, pp4));
        System.out.println(pp5.toString() +  " " + pp6.toString() + " " + equals(pp5, pp6));
    }//main

    public static <T>  List<T> listFilter(List<T> t, Predicate<T> predicate)
    {
        return t.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2)
   //boolean <T> Pair<T,T> equals(Pair p1, Pair p2)
    {

      return        (p1.first().equals(p2.first()) & (p1.second().equals(p2.second())));
    }

    public static <T,R> List<R> fromArrayToList(
            T[] a,
            Predicate<T> predicate,
            Function<T,R> mapper
    )
    {
        return Arrays.stream(a)
                .filter(predicate)
                .map(mapper)
                .collect(Collectors.toList());
    }

    // напишите шаблоную функцию которая преобразует массив чего угодно в
    // список
    public static <T> List<T> fromArrayToList(T[] a)
    {
        // до 21:47
        return Arrays.stream(a)
                .collect(Collectors.toList());
    }

    // напишите функцию которая принимает на вход массив чего угодно и возвращает
    // пару из первого и последнего элемента
    public static  <T> Pair<T,T> firstAndLast(T [] a)
    {
        // до 21:40
        return new PairImpl<>(a[0], a[a.length - 1]);
    }

    // напишите функцию swap которая принимает на вход массив чего угодно
    // и два номера
    // внутри массива обменивает элементы по этим номерам
    public static  <R> void swap( R [] s, int i, int j)
    {
        R tmp = s[i];
        s[j] =s[i];
        s[i] = tmp;
    }


    // напишите шаблонную функцию которая принимает на вход массив чего угодно
    // и возвращает первый элемент этого массива

    public static <T> T firstElement(T[] s)
    {
        return s[0];
    }

    // Generic == Шаблон
    // T - типовой параметр
    public static <T> void log(T t) // t - значение, T - тип
    {
        System.out.println("It's a " + t.getClass().getSimpleName() + ", value is: " + t);
    }
    public static void debug(int i)
    {
        System.out.println("It's a int, value is: " + i);
    }
    public static void debug(String s)
    {
        System.out.println("It's a String, value is: " + s);
    }

}
