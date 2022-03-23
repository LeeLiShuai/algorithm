package com.leeshuai.sort;

public class InsertionSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            //每次将i+1处的元素插入到0~1之间对应的位置
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
        ISort sort = new InsertionSort();
        sort.run();
    }
}
