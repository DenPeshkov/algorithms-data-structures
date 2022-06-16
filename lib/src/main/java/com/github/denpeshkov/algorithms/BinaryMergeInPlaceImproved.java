package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ComparableUtils.less;

public class BinaryMergeInPlaceImproved<T extends Comparable<? super T>>
    extends BinaryMergeInPlace<T> {

  @Override
  public void merge(T[] arr, int first, int middle, int last) {
    @SuppressWarnings("unchecked")
    T[] aux = (T[]) new Comparable[middle - first];

    merge(arr, first, middle, last, aux);
  }

  @Override
  public void merge(T[] arr, int first, int middle, int last, T[] aux) {
    System.arraycopy(arr, first, aux, 0, middle - first);

    int i = 0;
    int j = middle;

    for (int k = first; k < last; k++) {
      if (i >= middle - first) {
        break;
      } else if (j >= last) {
        arr[k] = aux[i++];
      } else if (less(arr[j], aux[i])) {
        arr[k] = arr[j++];
      } else {
        arr[k] = aux[i++];
      }
    }
  }
}
