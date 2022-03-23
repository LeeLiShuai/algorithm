package com.leeshuai.sort;

/**
 * 从小到大排序，大根堆
 */
public class HeapSort implements ISort {
    @Override
    public void sort(Comparable[] comparables) {
        for (int i = comparables.length / 2 - 1; i >= 0; i--) {
            adjustHeap(comparables, i, comparables.length);
        }
        for (int i = comparables.length - 1; i > 0; i--) {
            exchange(comparables, 0, i);
            adjustHeap(comparables, 0, i);
        }
    }

    public void adjustHeap(Comparable[] comparables, int k, int length) {
        for (int i = 2 * k + 1; i < length; i = 2 * i + 1) {
            if (i + 1 < length && less(comparables[i], comparables[i + 1])) {
                i++;
            }
            if (less(comparables[k], comparables[i])) {
                exchange(comparables, i, k);
                k = i;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ISort sort = new HeapSort();
        sort.run();
    }
}
