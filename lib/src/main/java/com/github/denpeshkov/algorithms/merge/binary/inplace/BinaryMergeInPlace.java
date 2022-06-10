package com.github.denpeshkov.algorithms.merge.binary.inplace;

import static com.github.denpeshkov.utils.ComparableUtils.greater;
import static com.github.denpeshkov.utils.ComparableUtils.lessOrEqual;

import java.util.Arrays;

public class BinaryMergeInPlace<T extends Comparable<? super T>>
    implements BinaryMergeInPlaceFunction<T> {

  @Override
  public void merge(T[] arr, int first, int middle, int last) {
    T[] aux = Arrays.copyOf(arr, arr.length);

    merge(arr, first, middle, last, aux);
  }

  public void merge(T[] arr, int lo, int mid, int hi, T[] aux) {
    System.arraycopy(arr, lo, aux, lo, hi - lo);

    int i = lo;
    int j = mid;

    for (int k = lo; k < hi; k++) {
      // <= is used to ensure stability
      if (j >= hi || lessOrEqual(aux[i], aux[j])) {
        arr[k] = aux[i++];
      } else if (i >= mid || greater(aux[i], aux[j])) {
        arr[k] = aux[j++];
      }
    }
  }
}
