package lesson28.HomeWork1_10_23;

public class CustomDequeGenericImplTester {
    public static void main(String[] args) {
        CustomDequeGenericImpl <String> dq = new CustomDequeGenericImpl<>();
        dq.addLast("first");
        dq.addLast("second");
        dq.addLast("third");
        dq.addLast("fourth");
        dq.addLast("fifth");
        System.out.println(dq);

        dq.addFirst("zero");
        System.out.println("After addFirst(\"zero\"): " + dq);

        dq.removeFirst();
        System.out.println("After removeFirst(\"zero\"): " + dq);

        dq.addLast("sixth");
        System.out.println("After addLast(\"sixth\"): " + dq);

        dq.removeLast();
        System.out.println("After removeLast(): " + dq);

        System.out.println("getLast(): " + dq.getLast());
        System.out.println("size(): " + dq.size());
    }

    /*
     CustomDeque c = new CustomDequeImpl();
        c.addFirst(3);
        c.addFirst(2);
        c.addFirst(1);
        System.out.println(c); // [1, 2, 3]
        c.addFirst(0);
        c.addFirst(-1);
        System.out.println(c); // [-1, 0, 1, 2, 3]
        System.out.println(c.getFirst()); // -1
        System.out.println(c.removeFirst()); // -1
        System.out.println(c); // [0, 1, 2, 3]
        System.out.println(c.getLast()); // 3
        c.addLast(4);
        System.out.println(c); // [0, 1, 2, 3, 4]
        System.out.println(c.removeLast()); // 4
        System.out.println(c); // [0, 1, 2, 3]
        System.out.println(c.size()); // 4

        c.removeFirst();
        c.removeLast();
        System.out.println(c); // [1, 2]
     */
}
