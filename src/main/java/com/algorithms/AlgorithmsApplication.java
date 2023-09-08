package com.algorithms;

import com.algorithms.search.LinearSearch;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.algorithms.search.LinearSearch.search;
import static com.algorithms.sorting.BubbleSort.bubbleSort;
import static com.algorithms.sorting.SelectionSort.selectionSort;
import static java.util.Arrays.binarySearch;

@SpringBootApplication
public class AlgorithmsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
        System.out.println(search(intArray, 1));
        System.out.println(search(stringArray, "cherry"));
        System.out.println(binarySearch(intArray, 1));
        System.out.println(binarySearch(stringArray, "cherry"));
        Integer[] intArrayUnSorted = {1, 2, 3, 4, 5, 9, 5, 3, 2, 88};
        String[] stringArrayUnSorted = {"apple", "date", "fig", "banana", "cherry",};
        String[] sortedStringArray = bubbleSort(stringArrayUnSorted);
        for (int i = 0; i < sortedStringArray.length; i++) {
            System.out.print(sortedStringArray[i] + " ,");
        }
        System.out.println(" ");
        Integer[] sortedIntArray = bubbleSort(intArrayUnSorted);
        extracted(intArrayUnSorted);
        extracted(selectionSort(intArrayUnSorted));
    }

    private static void extracted(Integer[] intArrayUnSorted) {
        for (int i = 0; i < intArrayUnSorted.length; i++) {
            System.out.print(intArrayUnSorted[i] + " ,");
        }
        System.out.println(" ");
    }
}
