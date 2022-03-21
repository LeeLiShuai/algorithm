package com.leeshuai.sort;

public class InsertionSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(comparables[j], comparables[j - 1])) {
                    exchange(comparables, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{1, 3, 5, 4, 2, 7, 6};
        ISort sort = new InsertionSort();
        sort.sort(nums);
        sort.print(nums);
    }
}
