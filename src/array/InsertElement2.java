package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElement2 {

    public static ArrayList<Integer> insertElement(Integer[] array,
                                                   int value,
                                                   int position) {
         ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

         list.add(position, value);
         return list;
    }

    private static void showNewArray(ArrayList<Integer> array) {

        for (Integer i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        showNewArray(insertElement(array, 50, 4));
    }
}
