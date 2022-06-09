package com.github.denpeshkov.algorithms.sorting;

@FunctionalInterface
public interface SortingFunction<T extends Comparable<? super T>> {

  default void sort(T[] arr) {
    sort(arr, 0, arr.length);
  }

  void sort(T[] arr, int from, int to);

  // TODO add sort for List
}
