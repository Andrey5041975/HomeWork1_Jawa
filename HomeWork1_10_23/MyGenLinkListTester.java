package lesson28.HomeWork1_10_23;

public class MyGenLinkListTester {
    public static void main(String[] args) {
        //Mu<String> f = new LinkedList<>();
        //MyGenLinkList<String> s = new MyGenericLinkedList_Class<>();
        MyGenericLinkedList_Class<String> s = new MyGenericLinkedList_Class<>();

        s.add("Sunday");
        s.add("Monday");
        s.add("Tuesday");
        s.add("Wednesday");
        s.add("Thursday");
        s.add("Friday");
        s.add("Saturday");
        System.out.println("All elements: " + s);
        System.out.println("s.contains(\"ten\") " + s.contains("ten")); // false
        System.out.println("s.contains(\"Sunday\") "+ s.contains("Sunday")); // true
        s.remove(0);
        System.out.println(s.size());
        System.out.println("After remove(0): " + s);

        s.addFirst("Sunday");
        System.out.println("After addFirst(): "  + s);

//        s.add(2,"DayNumberEight");
//        System.out.println("After add() with index = 2: "  + s);
        System.out.println("size(): " + s.size());

        s.set(2, "NoSuchDay");
        System.out.println("After Set: " + s);


        MyGenericLinkedList_Class<Double> d = new MyGenericLinkedList_Class();

        d.add(0.1);
        d.add(0.2);
        d.add(0.3);
        d.add(0.4);
        d.add(0.5);

        System.out.println(d);
        System.out.println("d.contains(0.2): " + d.contains(0.2));

        MyGenericLinkedList_Class<Integer> c = new MyGenericLinkedList_Class();

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        System.out.println(c);
        System.out.println("c.contains(1): " + c.contains(1));
    }

}
