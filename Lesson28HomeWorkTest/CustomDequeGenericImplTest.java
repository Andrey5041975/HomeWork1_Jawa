package Lesson28HomeWorkTest;

import lesson28.HomeWork1_10_23.CustomDequeGenericImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomDequeGenericImplTest {




    @Test
    public void addFirst()
    {
        CustomDequeGenericImpl<Double> cdg = new CustomDequeGenericImpl<>();
        cdg.addFirst(0.5);
        cdg.addFirst(0.59);
        cdg.addFirst(0.981);
        assertEquals("getFirst ",0.981,  cdg.getFirst(), 0.0001);
    }

    @Test
    public void removeLast()
    {
        CustomDequeGenericImpl<Double> cdg = new CustomDequeGenericImpl<>();
        cdg.addFirst(0.5);
        cdg.addFirst(0.59);
        cdg.addFirst(0.981);
        assertEquals("removeLast ", 0.5, cdg.removeLast(), 0.0001);
    }

}
