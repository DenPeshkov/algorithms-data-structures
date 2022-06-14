package com.github.denpeshkov.algorithms;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SuppressWarnings("SameNameButDifferent")
public class MergeSortBottomUp<T extends Comparable<? super T>> implements SortingFunction<T> {

  private final BinaryMergeInPlace<T> binaryMergeInPlace;

  @Override
  public void sort(T[] arr, int from, int to) {
    int N = arr.length;

    @SuppressWarnings("unchecked")
    T[] aux = (T[]) new Comparable[N];

    for (int len = 1; len < N; len *= 2) {
      for (int first = 0; first < N - len; first += 2 * len) {
        int middle = first + len;
        int last = Math.min(first + (2 * len), N);

        binaryMergeInPlace.merge(arr, first, middle, last, aux);
      }
    }
  }
}
