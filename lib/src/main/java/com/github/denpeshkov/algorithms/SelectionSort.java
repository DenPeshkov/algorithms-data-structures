package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ArrayUtils.swap;
import static com.github.denpeshkov.utils.ComparableUtils.less;

public class SelectionSort<T extends Comparable<? super T>> implements SortingFunction<T> {

  @Override
  public void sort(T[] arr, int from, int to) {
    for (int i = from; i < to; i++) {
      int minInd = i;

      for (int j = i + 1; j < to; j++) {
        if (less(arr[j], arr[minInd])) {
          minInd = j;
        }
      }

      swap(arr, i, minInd);
    }
  }
}
