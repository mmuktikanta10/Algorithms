package com.algorithms.sorting;

public class BubbleSort<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T[] bubbleSort(T[] dataSource) {
        boolean swaped;
        T current = null;
        T next = null;
        for (int i = 0; i < dataSource.length-1; i++) {
            swaped = false;
            for (int j = 0; j < dataSource.length-i-1; j++) {
                int comparedResult = dataSource[j].compareTo(dataSource[j + 1]);
                if (comparedResult > 0) {
                    current = dataSource[j];
                    next = dataSource[j + 1];
                    dataSource[j] = next;
                    dataSource[j + 1] = current;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }

        return dataSource;
    }
}
