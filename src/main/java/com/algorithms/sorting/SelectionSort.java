package com.algorithms.sorting;

public class SelectionSort<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T[] selectionSort(T[] dataSource) {
        for (int i = 0; i < dataSource.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < dataSource.length; j++) {
                int comparedResult = dataSource[j].compareTo(dataSource[minimumIndex]);
                if (comparedResult < 0) {
                    minimumIndex = j;
                }
            }
            if (minimumIndex != i) {
                T temp = dataSource[i];
                dataSource[i] = dataSource[minimumIndex];
                dataSource[minimumIndex] = temp;
            }
        }
        return dataSource;
    }
}
