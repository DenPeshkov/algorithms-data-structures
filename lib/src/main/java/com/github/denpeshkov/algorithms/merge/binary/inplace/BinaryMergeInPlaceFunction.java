package com.github.denpeshkov.algorithms.merge.binary.inplace;

@FunctionalInterface
public interface BinaryMergeInPlaceFunction<T extends Comparable<? super T>> {

  /**
   * Merges two consecutive sorted ranges [{@code first}, {@code middle}) and [{@code middle},
   * {@code last}) into one sorted range [{@code first}, {@code last})
   *
   * @param arr the array with the elements to be merged
   * @param first the beginning of the first sorted range, inclusive
   * @param middle the end of the first sorted range, exclusive, and the beginning of the second,
   *     inclusive
   * @param last the end of the second sorted range, exclusive
   */
  void merge(T[] arr, int first, int middle, int last);
}
