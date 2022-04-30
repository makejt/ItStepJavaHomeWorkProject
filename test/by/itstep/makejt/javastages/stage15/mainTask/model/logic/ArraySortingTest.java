package by.itstep.makejt.javastages.stage15.mainTask.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySortingTest {

    @Test
    public void testUniteArrays(){
        int [] array1 = {2, 5, 12, 15};
        int [] array2 = {1, 8, 11, 15, 19, 21};
        int [] expected = {1, 2, 5, 8, 11, 12, 15, 15, 19, 21};
        int [] actual = ArraySorting.uniteArrays(array1, array2, 4, 6);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testUniteArraysWithEqualElementsOfArrays(){
        int [] array1 = {2, 5, 12, 15};
        int [] array2 = {2, 5, 12, 15};
        int [] expected = {2, 2, 5, 5, 12, 12, 15, 15};
        int [] actual = ArraySorting.uniteArrays(array1, array2, 4, 4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testUniteArraysWithOneElement(){
        int [] array1 = {2};
        int [] array2 = {15};
        int [] expected = {2, 15};
        int [] actual = ArraySorting.uniteArrays(array1, array2, 1, 1);
        assertArrayEquals(expected, actual);
    }


    @Test(expected = RuntimeException.class)
    public void testUniteArraysWithNull() {
        ArraySorting.uniteArrays(null,null, 0, 0);
    }

    @Test(expected = RuntimeException.class)
    public void testUniteArraysWithEmptyArrays() {
        ArraySorting.uniteArrays(new int[0], new int [0], 0, 0);
    }



}
