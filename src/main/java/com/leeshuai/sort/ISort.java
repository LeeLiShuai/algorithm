package com.leeshuai.sort;

public interface ISort {
    void sort(Comparable[] comparables);

    /**
     * 参数一是否小于参数二
     *
     * @param p
     * @param q
     * @return
     */
    default boolean less(Comparable p, Comparable q) {
        return p.compareTo(q) < 0;
    }

    /**
     * 交换数组中对应下标的元素
     *
     * @param comparables
     * @param x
     * @param y
     */
    default void exchange(Comparable[] comparables, int x, int y) {
        Comparable temp = comparables[x];
        comparables[x] = comparables[y];
        comparables[y] = temp;
    }

    /**
     * 打印数组
     *
     * @param comparables
     */
    default void print(Comparable[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            if (i < comparables.length - 1) {
                System.out.print(comparables[i] + ",");
            } else {
                System.out.print(comparables[i]);
            }
        }
    }

    default void run() {
        Integer[] nums = new Integer[]{7, 6, 13, 9, 12, 1, 3, 5, 4, 2, 8, 14, 10, 16, 11, 15};
        this.sort(nums);
        this.print(nums);
        System.out.println();
        nums = new Integer[]{12, 1, 14, 10, 2, 8, 16, 3, 5, 7, 6, 13, 9, 11, 15, 4};
        this.sort(nums);
        this.print(nums);
        System.out.println();
        nums = new Integer[]{12, 7, 6, 16, 3, 15, 4, 10, 5, 9, 13, 1, 14, 11, 2, 8};
        this.sort(nums);
        this.print(nums);
    }
}
