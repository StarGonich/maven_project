package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterTest {
    @Test
    public void test() {
        Sorter sort = new Sorter();
        int[] a = new int[30];
        for (int i = 0; i < 30; i++) {
            a[i] = (int)(Math.random() * 1001);
        }
        sort.bubbleSort(a);
        Assertions.assertTrue(sort.isSorted(a));
    }
}
