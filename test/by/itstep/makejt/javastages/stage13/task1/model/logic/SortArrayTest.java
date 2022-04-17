package by.itstep.makejt.javastages.stage13.task1.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortArrayTest {
    @Test
    public void isSortingArrayWithAscSortingReturnTrue() {
        int[] array = {1, 5, 7, 8, 9, 20};
        boolean expected = true;
        boolean actual = SortArray.isSortingArray(array);
        assertTrue(actual);
    }

    @Test
    public void isSortingArrayWithDescSortingReturnTrue() {
        int[] array = {20, 9, 8, 7, 5, 1};
        boolean expected = true;
        boolean actual = SortArray.isSortingArray(array);
        assertTrue(actual);
    }

    @Test
    public void isSortingArrayReturnFalse() {
        int[] array = {1, 20, 7, 8, 9, 5};
        boolean expected = false;
        boolean actual = SortArray.isSortingArray(array);
        assertFalse(actual);
    }

    @Test(expected = RuntimeException.class)
    public void testWithNull() {
        SortArray.isSortingArray(null);
    }

    @Test(expected = RuntimeException.class)
    public void testWithEmptyArray() {
        SortArray.isSortingArray(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testWithOneElement() {
        SortArray.isSortingArray(new int[1]);
    }

}

