package com.github.denpeshkov.algorithms;

public class MergeSortTopDown<T extends Comparable<? super T>> implements SortingFunction<T> {

  private final BinaryMergeInPlace<T> binaryMergeInPlace;

  /** Top-down Mergesort using Binary in-place Merge */
  public MergeSortTopDown() {
    binaryMergeInPlace = new BinaryMergeInPlace<>();
  }

  MergeSortTopDown(BinaryMergeInPlace<T> binaryMergeInPlace) {
    this.binaryMergeInPlace = binaryMergeInPlace;
  }

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

    binaryMergeInPlace.merge(arr, first, middle, last, aux);
  }
}
