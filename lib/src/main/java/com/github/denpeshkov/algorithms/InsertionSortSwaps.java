package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ArrayUtils.swap;
import static com.github.denpeshkov.utils.ComparableUtils.less;

public class InsertionSortSwaps<T extends Comparable<? super T>> implements SortingFunction<T> {

  @Override
  public void sort(T[] arr, int from, int to) {
    for (int i = from + 1; i < to; i++) {
      for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
        swap(arr, j, j - 1);
      }
    }
  }
}
