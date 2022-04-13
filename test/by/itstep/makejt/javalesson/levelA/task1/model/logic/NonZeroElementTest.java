package by.itstep.makejt.javalesson.levelA.task1.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class NonZeroElementTest {

    @Test
    public void testBasic(){
        int [] array = {1, 0, -2, 0, 10, 0, 0};
        int expected = 3;
        int actual = NonZeroElement.countOfNonZeroElement(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithoutZeroElements(){
        int [] array = {1, 5, -2, 10, 10, 9, 2};
        int expected = array.length;
        int actual = NonZeroElement.countOfNonZeroElement(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithAllZeroElements(){
        int [] array = {0, 0, 0, 0, 0, 0, 0};
        int expected = 0;
        int actual = NonZeroElement.countOfNonZeroElement(array);
        assertEquals(expected, actual);
    }


    @Test
    public void testWithNull(){
        int expected = -1;
        int actual = NonZeroElement.countOfNonZeroElement(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithEmptyObject(){
        int expected = -1;
        int actual = NonZeroElement.countOfNonZeroElement(new int [0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithOneNonZeroElements(){
        int [] array = {10};
        int expected = 1;
        int actual = NonZeroElement.countOfNonZeroElement(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithOneZeroElements(){
        int [] array = {0};
        int expected = 0;
        int actual = NonZeroElement.countOfNonZeroElement(array);
        assertEquals(expected, actual);
    }
}
