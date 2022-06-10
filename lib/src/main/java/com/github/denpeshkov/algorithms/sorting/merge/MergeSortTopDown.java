package com.github.denpeshkov.algorithms.sorting.merge;

import com.github.denpeshkov.algorithms.merge.binary.inplace.BinaryMergeInPlace;
import com.github.denpeshkov.algorithms.sorting.SortingFunction;

public class MergeSortTopDown<T extends Comparable<? super T>> implements SortingFunction<T> {

  @Override
  public void sort(T[] arr, int first, int last) {
    @SuppressWarnings("unchecked")
    T[] aux = (T[]) new Comparable[arr.length];

    sort(arr, first, last, aux);
  }

  private void sort(T[] arr, int first, int last, T[] aux) {
    if (first >= last) {
      return;
    }

    int middle = (first + last) >>> 1;

    sort(arr, first, middle, aux);
    sort(arr, middle, last, aux);

    new BinaryMergeInPlace<T>().merge(arr, first, middle, last, aux);
  }
}
