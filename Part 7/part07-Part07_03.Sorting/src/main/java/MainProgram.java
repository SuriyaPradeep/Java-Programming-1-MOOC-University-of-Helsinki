import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array));
            int j=indexOfSmallestFrom(array,i);
            swap(array,i,j);
        }
    }
}
