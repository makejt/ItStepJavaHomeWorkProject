package by.itstep.makejt.javalesson.levelF.task1.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {

    private final int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};

    @Test
    public void testSortBeforeFirstZeroElement() {
       // int[] array = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
        int[] expectedArray = {2, 4, 5, 9, 0, 7, 5, 1, 0, 8};
        ArraySorter.sortBeforeFirstZeroElement(ARRAY);
        assertArrayEquals(expectedArray, ARRAY);
    }

    @Test
    public void testSortBeforeFirstZeroWithoutZeroElement() {
        int[] array = {5, 9, 2, 4, 6, 7, 5, 1, 8, 8};
        int[] expectedArray = {5, 9, 2, 4, 6, 7, 5, 1, 8, 8};
        ArraySorter.sortBeforeFirstZeroElement(array);
        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortAfterFirstZeroElement() {
      //  int[] array = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};
        int[] expectedArray = {0, 1, 2, 4, 5, 5, 7, 9, 0, 8};
        ArraySorter.sortAfterFirstZeroElement(ARRAY);
        assertArrayEquals(expectedArray, ARRAY);
    }
}
