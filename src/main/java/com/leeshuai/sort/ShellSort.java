package com.leeshuai.sort;

public class ShellSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        int h = 1;
        while (h < comparables.length / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            //内部和插入排序一样，内循环步长改为h
            for (int i = h; i < comparables.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (less(comparables[j], comparables[j - h])) {
                        exchange(comparables, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        ISort sort = new ShellSort();
        sort.run();
    }
}
