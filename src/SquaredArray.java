import java.util.Arrays;

public class SquaredArray {


    public static int[] getSortedSquaredArray(int[] array) {

        for (int count = 0; count < array.length; count++) {
            array[count] = array[count] * array[count];

            for (int counter = 0; counter < array.length; counter++) {
                if (array[count] < array[counter]) {
                    int temp = array[count];
                    array[count] = array[counter];
                    array[counter] = temp;
                }
            }
        }
        return array;
    }
}
