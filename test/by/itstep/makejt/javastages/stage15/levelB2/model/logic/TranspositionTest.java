package by.itstep.makejt.javastages.stage15.levelB2.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranspositionTest {

    @Test
    public void testTransposeMatrix() {
        int[][] array = {{2, 8, 7}, {3, 1, 9}, {5, 4, 3}};
        int[][] expected = {{2, 3, 5}, {8, 1, 4}, {7, 9, 3}};
        int[][] actual = Transposition.transposeMatrix(array);
        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testTransposeOneDimensionalMatrix() {
        Transposition.transposeMatrix(new int[2][3]);
    }

    @Test(expected = RuntimeException.class)
    public void testTransposeMatrixWithNull() {
        Transposition.transposeMatrix(null);
    }

    @Test(expected = RuntimeException.class)
    public void testTransposeMatrixWithEmptyArray() {
        Transposition.transposeMatrix(new int[0][0]);
    }
}
