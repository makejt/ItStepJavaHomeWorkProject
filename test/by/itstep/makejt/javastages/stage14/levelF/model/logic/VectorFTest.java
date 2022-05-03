package by.itstep.makejt.javastages.stage14.levelF.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorFTest {

    private final int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};

    @Test
    public void testSortElementsBeforeN(){
        int[] array = ARRAY;
        int n = 7;
        int[] expected = {0, 2, 4, 5, 9, 7, 5, 1, 0, 8};
        VectorF.sortElementsBeforeN(array, n);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortElementsWithoutN(){
        int[] array = ARRAY;
        int n = 11;
        int[] expected = ARRAY;
        VectorF.sortElementsBeforeN(array, n);
        assertArrayEquals(expected, array);
    }


}
