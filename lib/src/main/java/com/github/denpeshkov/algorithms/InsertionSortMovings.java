package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ComparableUtils.greater;

public class InsertionSortMovings<T extends Comparable<? super T>> implements SortingFunction<T> {

  @Override
  public void sort(T[] arr, int from, int to) {
    for (int i = from + 1; i < to; i++) {
      T el = arr[i];
      int j = i - 1;

      while (j >= from && greater(arr[j], el)) {
        arr[j + 1] = arr[j];
        j--;
      }

      arr[j + 1] = el;
    }
  }
}
