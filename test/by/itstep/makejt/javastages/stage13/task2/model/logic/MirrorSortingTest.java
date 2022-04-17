package by.itstep.makejt.javastages.stage13.task2.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class MirrorSortingTest {

    @Test
    public void isMirrorSortingArrayReturnTrue() {
        int[] array = {1, 2, 3, 5, 3, 2, 1};
        boolean expected = true;
        boolean actual = MirrorSorting.isMirrorSortingArray(array);
        assertTrue(actual);
    }

    @Test
    public void isMirrorSortingArrayReturnFalse() {
        int[] array = {1, 4, 3, 5, 3, 2, 1};
        boolean expected = false;
        boolean actual = MirrorSorting.isMirrorSortingArray(array);
        assertFalse(actual);
    }

    @Test(expected = RuntimeException.class)
    public void testWithNull() {
        MirrorSorting.isMirrorSortingArray(null);
    }

    @Test(expected = RuntimeException.class)
    public void testWithEmptyArray(){
        MirrorSorting.isMirrorSortingArray(new int [0]);
    }

    @Test(expected = RuntimeException.class)
    public void testWithOneElement() {
        MirrorSorting.isMirrorSortingArray(new int [1]);
    }


}
