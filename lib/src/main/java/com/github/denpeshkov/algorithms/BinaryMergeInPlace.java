package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ComparableUtils.greater;
import static com.github.denpeshkov.utils.ComparableUtils.lessOrEqual;

public class BinaryMergeInPlace<T extends Comparable<? super T>>
    implements BinaryMergeInPlaceFunction<T> {

  @Override
  public void merge(T[] arr, int first, int middle, int last) {
    @SuppressWarnings("unchecked")
    T[] aux = (T[]) new Comparable[arr.length];

    merge(arr, first, middle, last, aux);
  }

  /**
   * Merges two consecutive sorted ranges [{@code first}, {@code middle}) and [{@code middle},
   * {@code last}) into one sorted range [{@code first}, {@code last})
   *
   * @param arr the array with the elements to be merged
   * @param first the beginning of the first sorted range, inclusive
   * @param middle the end of the first sorted range, exclusive, and the beginning of the second,
   *     inclusive
   * @param last the end of the second sorted range, exclusive
   * @param aux the auxiliary array to store the elements in the range [{@code first}, {@code last})
   */
  public void merge(T[] arr, int first, int middle, int last, T[] aux) {
    System.arraycopy(arr, first, aux, first, last - first);

    int i = first;
    int j = middle;

    for (int k = first; k < last; k++) {
      // <= is used to ensure stability
      if (j >= last || lessOrEqual(aux[i], aux[j])) {
        arr[k] = aux[i++];
      } else if (i >= middle || greater(aux[i], aux[j])) {
        arr[k] = aux[j++];
      }
    }
  }
}
