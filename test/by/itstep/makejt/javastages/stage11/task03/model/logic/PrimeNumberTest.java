package by.itstep.makejt.javastages.stage11.task03.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void isPrimeNumberTestReturnTrue() {
        int[] array = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            boolean actual = PrimeNumber.isPrimeNumber(number);
            String error = String.format("Error with number %d)", i);
            assertTrue(error, actual);
        }
    }

        @Test
        public void isPrimeNumberTestReturnFalse(){
            int [] array = {4, 6, 8, 10, 12, 20, 100};
            for (int i = 0; i < array.length; i++) {
                int number = array [i];
                boolean actual = PrimeNumber.isPrimeNumber(number);
                String error = String.format ("Error with number %d)", i);
                assertFalse(error, actual);
            }
    }
}
