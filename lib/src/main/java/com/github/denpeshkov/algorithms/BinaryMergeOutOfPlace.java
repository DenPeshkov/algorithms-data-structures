package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ComparableUtils.less;

import java.lang.reflect.Array;

public class BinaryMergeOutOfPlace<T extends Comparable<? super T>>
    implements BinaryMergeOutOfPlaceFunction<T> {

  @Override
  public T[] merge(T[] arr1, T[] arr2) {
    int N = arr1.length + arr2.length;

    @SuppressWarnings("unchecked")
    T[] result = (T[]) Array.newInstance(arr1.getClass(), N);

    for (int k = 0, i = 0, j = 0; k < N; k++) {
      if (k >= arr1.length) {
        result[k] = arr2[j++];
      } else if (k >= arr2.length) {
        result[k] = arr1[i++];
      } else if (less(arr2[j], arr1[i])) {
        result[k] = arr2[j++];
      } else {
        result[k] = arr1[i++];
      }
    }

    return result;
  }
}
