package array;

public class DeleteElement1 {

    /*
    Delete an element at special index
     */

    public static int[] deleteElement(int[] array,
                                      int sizeOfArray,
                                      int index) {
        int[] newArray = new int[sizeOfArray - 1];

        if (array == null || index < 0 || index >= array.length) {
            return array;
        }

        for (int i = 0, k = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }

            newArray[k++] = array[i];
        }

        return newArray;
    }

    public static void showArray(int[] array){

        for (int i : array
             ) {
            System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        showArray(deleteElement(array, array.length, 5));
    }
}
