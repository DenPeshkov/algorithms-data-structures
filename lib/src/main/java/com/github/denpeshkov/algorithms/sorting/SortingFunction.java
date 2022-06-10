package com.github.denpeshkov.algorithms.sorting;

@FunctionalInterface
public interface SortingFunction<T extends Comparable<? super T>> {

  /**
   * Sorts the specified array into non-descending order
   *
   * @param arr the array to be sorted
   */
  default void sort(T[] arr) {
    sort(arr, 0, arr.length);
  }

  /**
   * Sorts the elements in the range [{@code first}, {@code last}) of the array into non-descending
   * order
   *
   * @param arr the array with the elements to be sorted
   * @param from the index of the first element, inclusive, to be sorted
   * @param to the index of the last element, exclusive, to be sorted
   */
  void sort(T[] arr, int from, int to);

  // TODO add sort for List
}
