package com.leeshuai.sort;

public class SelectionSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        for(int i = 0 ;i<comparables.length;i++){
            //每次从i+1开始，选择一个最小的小标，和i的位置进行交换
            int min = i;
            for (int j=i+1;j<comparables.length;j++){
                if(less(comparables[j],comparables[min])){
                    min = j;
                }
            }
            exchange(comparables,i,min);
        }
    }

    public static void main(String[] args) {
        ISort sort = new SelectionSort();
        sort.run();
    }
}
