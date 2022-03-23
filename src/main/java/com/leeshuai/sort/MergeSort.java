package com.leeshuai.sort;

public class MergeSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        Comparable[] aux = new Comparable[comparables.length];
        sort(comparables, aux, 0, comparables.length - 1);
    }

    public void sort(Comparable[] comparables, Comparable[] aux, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = (lo + hi) / 2;
        sort(comparables, aux, lo, mid);
        sort(comparables, aux, mid + 1, hi);
        merge(comparables, aux, lo, mid, hi);
    }

    /**
     * 两个有序数组合并
     * @param comparables
     * @param aux
     * @param lo
     * @param mid
     * @param hi
     */
    private void merge(Comparable[] comparables, Comparable[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = comparables[i];
        }
        int j = lo, k = mid + 1;
        for (int index = lo; index <= hi; index++) {
            if (j > mid) {
                comparables[index] = aux[k++];
            } else if (k > hi) {
                comparables[index] = aux[j++];
            } else if (less(aux[j], aux[k])) {
                comparables[index] = aux[j++];
            } else {
                comparables[index] = aux[k++];
            }
        }
    }

    public static void main(String[] args) {
        ISort sort = new MergeSort();
        sort.run();
    }
}
