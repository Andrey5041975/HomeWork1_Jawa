package Lesson28HomeWorkTest;

import lesson28.HomeWork1_10_23.MyGenericLinkedList_Class;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class MyGenericLinkedListTest {




    @Test
    public void testSize()
    {
        System.out.println("Тестирование MyGenericLinkedList_Class Size Test");
        MyGenericLinkedList_Class<Double> c = new MyGenericLinkedList_Class();

        c.add(0.1);
        c.add(0.2);
        c.add(0.3);
        c.add(0.4);
        c.add(0.5);

        assertEquals("", 5, c.size());

    }
    @Test
    public void testContains()
    {
        System.out.println("Тестирование MyGenericLinkedList_Class Add Test");
        MyGenericLinkedList_Class<Double> c = new MyGenericLinkedList_Class();

        c.add(0.1);
        c.add(0.2);
        c.add(0.3);
        c.add(0.4);
        c.add(0.5);

        assertEquals("testContains", true, c.contains(0.1));

    }

    @Test
    public void testGet()
    {
        System.out.println("Тестирование MyGenericLinkedList_Class Add Test");
        MyGenericLinkedList_Class<Double> g = new MyGenericLinkedList_Class();

        g.add(0.1);
        g.add(0.2);
        g.add(0.3);
        g.add(0.4);
        g.add(0.5);

        assertEquals("testGet",
                0.3,
                g.get(2),
                0.001);

    }
}
