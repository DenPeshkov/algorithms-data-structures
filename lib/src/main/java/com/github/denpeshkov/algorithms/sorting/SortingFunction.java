package com.github.denpeshkov.algorithms.sorting;

@FunctionalInterface
public interface SortingFunction {

  default <T extends Comparable<? super T>> void sort(T[] arr) {
    sort(arr, 0, arr.length);
  }

  <T extends Comparable<? super T>> void sort(T[] arr, int from, int to);

  // TODO add sort for List
}
