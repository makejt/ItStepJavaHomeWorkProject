package by.itstep.makejt.javastages.stage13.task3.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayServiceTest {

    @Test
    public void testIsAllElementsEqualReturnTrue(){
        int [] array = {5, 5, 5, 5, 5};
        boolean expected = true;
        boolean actual = ArrayService.isAllElementsEqual(array);
        assertTrue(actual);
    }

        @Test
        public void testIsAllElementsEqualReturnFalse(){
            int [] array = {5, 5, 5, 5, 2};
            boolean expected = false;
            boolean actual = ArrayService.isAllElementsEqual(array);
            assertFalse(actual);
        }

    @Test (expected = RuntimeException.class)
    public void testIsAllElementsEqualWithNull(){
        ArrayService.isAllElementsEqual(null);
    }

    @Test (expected = RuntimeException.class)
    public void testIsAllElementsEqualWithEmptyArray(){
        ArrayService.isAllElementsEqual (new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testIsAllElementsEqualWithOneElement(){
        ArrayService.isAllElementsEqual(new int[1]);

    }

        @Test
    public void testIsAllElementsDifferentReturnTrue(){
        int [] array = {5, 7, 9, 11, 3};
        boolean expected = true;
        boolean actual = ArrayService.isAllElementsDifferent(array);
        assertTrue(actual);
        }

        @Test
    public void testIsAllElementsDifferentReturnFalse(){
        int [] array = {5, 7, 9, 11, 5};
        boolean expected = false;
        boolean actual = ArrayService.isAllElementsDifferent(array);
        assertFalse(actual);
    }

    @Test (expected = RuntimeException.class)
    public void testIsAllElementsDifferentWithNull(){
        ArrayService.isAllElementsDifferent(null);
    }

    @Test (expected = RuntimeException.class)
    public void testIsAllElementsDifferentWithEmptyArray(){
        ArrayService.isAllElementsDifferent(new int[0]);
    }

    @Test (expected = RuntimeException.class)
    public void testIsAllElementsDifferentWithOneElement(){
        ArrayService.isAllElementsDifferent(new int[1]);
    }

}
