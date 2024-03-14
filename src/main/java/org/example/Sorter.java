package org.example;

public class Sorter {

    public boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    public void bubbleSort(int[] array) {
        int length = array.length;
        while (length != 0) {
            int max_index = 0;
            for (int i = 1; i < length; i++) {
                if (array[i-1] > array[i]) {
                    int temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    max_index = i;
                }
            }
            length = max_index;
        }
    }

    public void bubbleSort(long[] array) {
        int length = array.length;
        while (length != 0) {
            int max_index = 0;
            for (int i = 1; i < length; i++) {
                if (array[i-1] > array[i]) {
                    long temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    max_index = i;
                }
            }
            length = max_index;
        }
    }

    public void quickSort(int[] a) {
        partition(a, 0, a.length-1);
    }

    public static void partition(int[] a, int L, int R) {
        int x = a[(L + R) / 2];
        int i = L;
        int j = R;
        do {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }
            if (i <= j) {
                int y = a[i];
                a[i] = a[j];
                a[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (L < j) {
            partition(a, L, j);
        }
        if (i < R) {
            partition(a, i, R);
        }
    }

    public void quickSort(long[] a) {
        partition(a, 0, a.length-1);
    }

    public static void partition(long[] a, int L, int R) {
        long x = a[(L + R) / 2];
        int i = L;
        int j = R;
        do {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x) {
                j--;
            }
            if (i <= j) {
                long y = a[i];
                a[i] = a[j];
                a[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (L < j) {
            partition(a, L, j);
        }
        if (i < R) {
            partition(a, i, R);
        }
    }
}
