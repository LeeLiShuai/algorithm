package com.leeshuai.sort;

public interface ISort {
    void sort(Comparable[] comparables);

    default boolean less(Comparable p,Comparable q){
        return p.compareTo(q) < 0;
    }

    default void exchange(Comparable[] comparables,int x,int y){
        Comparable temp = comparables[x];
        comparables[x] = comparables[y];
        comparables[y] = temp;
    }

    default void print(Comparable[] comparables){
        for (int i = 0; i < comparables.length; i++) {
            System.out.println(comparables[i]);
        }
    }
}
