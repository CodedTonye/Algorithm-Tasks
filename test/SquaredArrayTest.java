import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaredArrayTest {

    @Test
    public void testThatArrayReturnsSquaredNumbersInAscendingOrder() {
        int[] array = {3, 2, 7, 1, 4};

        int[] expected = {1, 4, 9, 16, 49};

        int[] actual = SquaredArray.getSortedSquaredArray(array);

        assertArrayEquals(expected, actual);
    }

}