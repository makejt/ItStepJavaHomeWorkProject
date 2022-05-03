package by.itstep.makejt.javastages.stage14.levelC.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorCTest {

    @Test
    public void testCountEqualElements() {
        int[] array = {4, 6, 9};
        int n = 3;
        int expected = 2;
        int actual = VectorC.countElements(array, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountElementsWithoutEqualElements() {
        int[] array = {3, 1, 72};
        int n = 1;
        int expected = 0;
        int actual = VectorC.countElements(array, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithNull() {
        int n = 1;
        int expected = -1;
        int actual = VectorC.countElements(null, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithEmptyArray() {
        int n = 1;
        int expected = -1;
        int actual = VectorC.countElements(new int[0], n);
        assertEquals(expected, actual);
    }

}
