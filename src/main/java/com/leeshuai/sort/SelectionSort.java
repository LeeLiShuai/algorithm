package com.leeshuai.sort;

public class SelectionSort implements ISort {

    @Override
    public void sort(Comparable[] comparables) {
        for(int i = 0 ;i<comparables.length;i++){
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
        Integer[] nums = new Integer[]{1,3,5,4,2,7,6};
        SelectionSort sort = new SelectionSort();
        sort.sort(nums);
        sort.print(nums);
    }
}
