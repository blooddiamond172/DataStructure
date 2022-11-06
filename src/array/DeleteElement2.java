package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteElement2 {

    public static int[] deleteElement(int[] array,
                                      int index) {
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());

        if (array == null || index < 0 || index >= array.length) {
            return array;
        }

        list.remove(index - 1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void showArray(int[] array) {

        for (Integer i : array
        ) {
            System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        showArray(deleteElement(array, 5));
    }
}
