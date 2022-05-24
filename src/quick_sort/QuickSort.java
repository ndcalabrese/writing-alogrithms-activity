package quick_sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // Test 1:
        int N1 = 5;
        int[] array1 = { 4, 1, 3, 9, 7 };
        quickSort(array1, 0, N1 - 1);
        System.out.println(Arrays.toString(array1));

        // Test 2:
        int N2 = 9;
        int[] array2 = { 2, 1, 6, 10, 4, 1, 3, 9, 7 };
        quickSort(array2, 0, N2 - 1);
        System.out.println(Arrays.toString(array2));

    }

    public static int partition (int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // pi stands for 'partitioning index'
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
}
