package com.leeshuai.sort;

public class QuickSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        sort(comparables, 0, comparables.length - 1);
    }

    private void sort(Comparable[] comparables, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int i = partition(comparables, lo, hi);
        sort(comparables, lo, i - 1);
        sort(comparables, i + 1, hi);
    }

    private int partition(Comparable[] comparables, int lo, int hi) {
        int l = lo, r = hi + 1;
        while (true) {
            //从右边找到第一个小于lo处的元素，如果没有跳出
            while (less(comparables[lo], comparables[--r])) {
                if (r == lo) {
                    break;
                }
            }
            //从左边找到第一个大于lo处的元素，如果没有跳出
            while (l < r && less(comparables[++l], comparables[lo])) {
                if (l == hi) {
                    break;
                }
            }
            //如果l,r相遇，跳出
            if (l >= r) {
                break;
            }
            //没相遇，交换l,r,继续下一次循环
            exchange(comparables, l, r);
        }
        //循环完毕，l,r相等，交换lo,r
        exchange(comparables, lo, r);
        return r;
    }

    public static void main(String[] args) {
        ISort sort = new QuickSort();
        sort.run();
    }
}
