package com.algorithms.search;

public class LinearSearch<T> {
    public static <T> int search(T[] dataSource, T value) {
        if (dataSource == null) {
            return -1;
        }
        for (int i = 0; i < dataSource.length; i++) {
            if (dataSource[i] == value) {
                return i;
            }

        }
        return -1;
    }
}
