package com.github.denpeshkov.algorithms;

import static com.github.denpeshkov.utils.ComparableUtils.lessOrEqual;

public class MergeSortBottomUpImproved<T extends Comparable<? super T>>
    extends MergeSortBottomUp<T> {

  /** Improved Bottom-up Mergesort using Improved Binary in-place Merge */
  public MergeSortBottomUpImproved() {
    super(new BinaryMergeInPlaceImproved<>());
  }

  MergeSortBottomUpImproved(BinaryMergeInPlaceImproved<T> binaryMergeInPlaceImproved) {
    super(binaryMergeInPlaceImproved);
  }

  @Override
  public void sort(T[] arr, int from, int to) {
    int N = arr.length;

    @SuppressWarnings("unchecked")
    T[] aux = (T[]) new Comparable[N];

    for (int len = 1; len < N; len *= 2) {
      for (int first = 0; first < N - len; first += 2 * len) {
        int middle = first + len;
        int last = Math.min(first + (2 * len), N);

        if (lessOrEqual(arr[middle - 1], arr[middle])) {
          continue;
        }

        getBinaryMergeInPlace().merge(arr, first, middle, last, aux);
      }
    }
  }
}
