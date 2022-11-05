package array;

    /*
    Insert an element have value 50 into array at position = 5
     */

public class InsertElement1 {

    public static int[] insertElement(int[] array,
                                      int sizeOfArray,
                                      int value,
                                      int position) {
        int[] newArray = new int[sizeOfArray + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < position - 1) {
                newArray[i] = array[i];
            } else if (i == position - 1) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    private static void showNewArray(int[] array) {

        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        showNewArray(insertElement(numbers, 9, 50, 5));
    }
}
