package org.whl.algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by honglwan on 5/23/2016.
 */
public class QuickSort {

    public static void main(String[] args) {

        int size = 10;
        int max = 50;
        int[] data = new int[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = generator.nextInt(max);
        }

        System.out.println("Befor sort: " + Arrays.toString(data));

        QuickSort quickSort = new QuickSort();

        quickSort.quicksort(data, 0, data.length - 1);

        System.out.println("After sort: " + Arrays.toString(data));
    }

    public void quicksort(int[] data, int low, int high) {

        if (data == null || data.length == 0) {
            return;
        }

        int i = low;
        int j = high;
        int pivot = data[low + (high - low) / 2];

        while (i <= j) {
            while (data[i] < pivot) {
                i++;
            }

            while (data[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(data, i, j);
                i++;
                j--;
            }
        }

        if (i < high) {
            quicksort(data, i, high);
        }

        if (low < j) {
            quicksort(data, low, j);
        }

    }

    private void exchange(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
