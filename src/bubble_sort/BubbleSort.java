package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Test 1:
        int[] arr1 = {4, 1, 3, 9, 7};
        int n1 = 5;
        bubbleSort(arr1, n1);
        System.out.println(Arrays.toString(arr1));

        // Test 2:
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n2 = 10;
        bubbleSort(arr2, n2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void bubbleSort(int[] array, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
