package by.itstep.makejt.javastages.stage14.levelD.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorDTest {

    @Test
    public void testIsOppositeElementsReturnTrue(){
        int[] array = {1, 2, 5, 4, -2, 0};
        boolean expected = true;
        boolean actual = VectorD.isOppositeElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsOppositeElementsReturnFalse(){
        int[] array = {1, 2, 5, 4, 2, 0};
        boolean expected = false;
        boolean actual = VectorD.isOppositeElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsOppositeElementsWithOneElement(){
        int[] array = {5};
        boolean expected = false;
        boolean actual = VectorD.isOppositeElements(array);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testWithNull() {
        VectorD.isOppositeElements(null);
    }

    @Test(expected = RuntimeException.class)
    public void testWithEmptyArray(){
        VectorD.isOppositeElements(new int [0]);
    }


}
