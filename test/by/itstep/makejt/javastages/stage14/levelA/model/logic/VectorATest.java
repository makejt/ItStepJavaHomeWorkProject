package by.itstep.makejt.javastages.stage14.levelA.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorATest {

    @Test
    public void testCountEvenElements() {
        int[] array = {1, 5, 27, 8, 15, 14};
        int expected = 2;
        int actual = VectorA.countEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithZero() {
        int[] array = {1, 5, 0, 0, 15, 14};
        int expected = 3;
        int actual = VectorA.countEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithoutEvenElements() {
        int[] array = {1, 5, 3, 21, 15, 39};
        int expected = 0;
        int actual = VectorA.countEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithOneNonEvenElement() {
        int[] array = {19};
        int expected = 0;
        int actual = VectorA.countEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithOneEvenElement() {
        int[] array = {22};
        int expected = 1;
        int actual = VectorA.countEvenElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithNull() {
        int expected = -1;
        int actual = VectorA.countEvenElements(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountEvenElementsWithEmptyArray() {
        int expected = -1;
        int actual = VectorA.countEvenElements(new int[0]);
        assertEquals(expected, actual);
    }

}
