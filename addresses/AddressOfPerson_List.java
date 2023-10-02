package addresses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressOfPerson_List {
    public static void main(String[] args) {

/*
 1 уровень сложности: 1. Есть два класса : Address с полями улица и номер дома и
 Persons  с полями name и address.
Напишите метод List
 getAddresses(List persons)
то есть по списку persons возвращать список их адресов
 */

        List<Persons> listPerson = new ArrayList<Persons>();

        Address address1 = new Address("Street 1", 1);
        Address address2 = new Address("Street 2", 11);
        Address address3 = new Address("Street 3", 111);
        Address address4 = new Address("Svetlaya", 10);
        Address address5 = new Address("Novaya", 15);
        Address address6 = new Address("Fruktovaya", 15);
        Address address7 = new Address("Svoboda", 15);
        Address address8 = new Address("Lipovaya", 15);
        Address address9 = new Address("Novaya", 15);


        Persons p1 = new Persons("John Smith", address1);
        Persons p2 = new Persons("Vovan Vovanov", address2);
        Persons p3 = new Persons("Marat Smirnov", address3);
        Persons p4 = new Persons("Maya Svetlova", address4);
        Persons p5 = new Persons("Vasiliy Kriuk", address5);
        Persons p6 = new Persons("Daria Pegova", address6);
        Persons p7 = new Persons("Ivan Sharapov", address7);
        Persons p8 = new Persons("M Sonov", address8);
        Persons p9 = new Persons("Tigran Garikov", address9);

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        listPerson.add(p6);
        listPerson.add(p7);
        listPerson.add(p8);
        listPerson.add(p9);

        System.out.println(getAdresses(listPerson));





        // task 2
        // Есть два списка одинаковой длины с числами.
        // Напишите метод, возвращающий список с элементами Yes или No
        // где значение на і-том месте зависит от того, равны ли элементы двух списков под номером і  -
        // например, {1,2,3,4,12} и {5,2,3,3,0}->{"No", "Yes", "Yes", "No", "No"}
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(12);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(0);
        //ArrayList<Boolean> listIsEquals = new ArrayList<Boolean>();
        ArrayList<String> listIsEquals = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) { /// equals
                listIsEquals.add("Yes");
            } else {
                listIsEquals.add("No");
            }
        }


        /*
        //     Есть два списка одинаковой длины с числами.
    //Напишите метод, возвращающий список с элементами Yes или No
    //где значение на і-том месте зависит от того, равны ли элементы двух списков под номером і  -
    //например, {1,2,3,4,12} и {5,2,3,3,0}->{"No", "Yes", "Yes", "No", "No"}
    public static List<String> compare(List<Integer> a, List<Integer> b)
    {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < a.size(); i++)
        {
            result.add(
                    a.get(i).equals(b.get(i)) ? "Yes" : "No"
            );
        }
        return result;
    }
         */

        System.out.println("Список 1 " + list1);
        System.out.println("Список 2 " + list2);
        System.out.println("Сравнение списков поэлементно  " + listIsEquals);
        System.out.println();

        //task 3
        // Напишите функцию, меняющую порядок следования элементов в списке на противоположный -
        // например, {1,2,3} -> {3,2,1}
        list1.remove(3);
        list1.remove(3);
        System.out.println("Исходный список " + list1);
        System.out.println("Инвертированный список " + changeOrder(list1));
        System.out.println();

        //task 4
        //Напишите функцию, возвращающую второй по величине элемент списка целых -
        //например, {1,3,4,2} -> 3
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(3);
        list3.add(4);
        list3.add(2);
        System.out.println("Исходный список: " + list3);
        System.out.println("Второй по величине " + secondBySize(list3));

    }

    public static List<Address> getAdresses (List<Persons> lp)

    {
        List<Address> la = new ArrayList<>();
        for (int i = 0; i < lp.size(); i++)
              {
        la.add(lp.get(i).getAddress());
        }
        return la;
    }

    public static List<Integer> changeOrder(ArrayList<Integer> a) {
        List<Integer> quitList = new ArrayList<>();
        for (int i = a.size() - 1; i > -1; i--) {
            quitList.add(a.get(i));
        }
        return quitList;
    }

    /*
    //     Напишите функцию, меняющую порядок следования элементов в списке на противоположный -
    //например, {1,2,3} -> {3,2,1}
    public static void reverse(List<Integer> a)
    {   // 0 1 2 i: a.size() - 1 - i
        // 1 2 3
        for(int i = 0; i < a.size() / 2 ; i++)
        {
            int temp = a.get(i);
            a.set(i, a.get(a.size() - 1 - i));
            a.set(a.size() - 1 - i, temp);
        }
    }
     */

    public static int secondBySize(ArrayList<Integer> arr) {
        int s;
        Collections.sort(arr);
        System.out.println("Отсортированный список: " + arr);
        return s = arr.get(arr.size() -2); //my

        /*
        //     Напишите функцию, возвращающую второй по величине элемент списка целых -
    //например, {1,3,4,2} -> 3
    public static int findSecondMax(List<Integer> a)
    {
        Collections.sort(a); // сортируем
        int last = a.get(a.size() - 1); // значение максимума
        a.removeAll(Arrays.asList(last)); // удаляем все такие элементы
        return a.get(a.size() - 1); // возвращаем последний
    }
         */
    }
}







