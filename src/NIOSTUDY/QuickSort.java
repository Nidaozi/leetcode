package NIOSTUDY;

import java.util.Arrays;

public class QuickSort {
    private int partition(int[] array, int left, int right) {
        int mid = right;
        int pivot = array[mid];
        right--;
        while (left < right) {
            while (left < mid && array[left] < pivot) {
                left++;
            }
            while (right > 0 && pivot < array[right]) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        swap(array, left, mid);
        return left;
    }

    private void sort(int[] array) {
        dosort(array, 0, array.length - 1);
    }

    private void dosort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = randomPartition(array, left, right);
            dosort(array, left, pivot - 1);
            dosort(array, pivot + 1, right);
        }
    }

    private int randomPartition(int[] array, int left, int right) {
        int randomIndex = left + (int) (Math.random() * (right - left + 1));
        swap(array, randomIndex, right);
        return partition(array, left, right);
    }

    private void swap(int[] array, int randomIndex, int right) {
        int temp = array[randomIndex];
        array[randomIndex] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 1, 32, 0, 1, 5, 12, 2, 5, 7, 8, 9, 2, 44, 111, 5};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
