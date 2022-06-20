package com.github.denpeshkov.algorithms;

@FunctionalInterface
public interface BinaryMergeOutOfPlaceFunction<T extends Comparable<? super T>> {

  /**
   * Merges two sorted arrays {@code arr1} and {@code arr2} into one sorted array
   *
   * @param arr1 the first array to be merged
   * @param arr2 the second array to be merged
   * @return the sorted merged array
   */
  T[] merge(T[] arr1, T[] arr2);
}
