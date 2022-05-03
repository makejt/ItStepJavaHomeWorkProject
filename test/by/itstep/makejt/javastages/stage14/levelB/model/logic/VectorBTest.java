package by.itstep.makejt.javastages.stage14.levelB.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorBTest {

    @Test
    public void testCountElementsEqualN() {
        int[] array = {1, 4, 10, 8, 40, -10, 20};
        int n = 10;
        int expected = 2;
        int actual = VectorB.countElementsEqualN(array, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountElementsEqualNWithoutN() {
        int[] array = {1, 4, 11, 8, 40, -11, 20};
        int n = 10;
        int expected = 0;
        int actual = VectorB.countElementsEqualN(array, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountElementsEqualNWithNull() {
        int n = 10;
        int expected = -1;
        int actual = VectorB.countElementsEqualN(null, n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountElementsEqualNWithEmptyArray() {
        int n = 10;
        int expected = -1;
        int actual = VectorB.countElementsEqualN(new int[0], n);
        assertEquals(expected, actual);
    }

}
