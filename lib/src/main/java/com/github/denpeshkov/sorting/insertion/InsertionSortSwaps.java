package com.github.denpeshkov.sorting.insertion;

import static com.github.denpeshkov.utils.ArrayUtils.swap;
import static com.github.denpeshkov.utils.ComparableUtils.less;

import com.github.denpeshkov.sorting.SortingFunction;

public class InsertionSortSwaps implements SortingFunction {

  @Override
  public <T extends Comparable<? super T>> void sort(T[] arr, int from, int to) {
    for (int i = from + 1; i < to; i++) {
      for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) {
        swap(arr, j, j - 1);
      }
    }
  }
}
