package com.algorithms.search;

public class BinarySearch<T extends Comparable<T>> {
    public static <T extends Comparable<T>> int binarySearch(T[] dataSource, T value) {
        int min = 0;
        int max = dataSource.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            int comparedResult = dataSource[mid].compareTo(value);
            if (comparedResult == 0) {
                return mid;
            } else if (comparedResult < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return -1;
    }
}
