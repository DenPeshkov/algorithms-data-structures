package com.github.denpeshkov.algorithms.merge.binary.inplace;

@FunctionalInterface
public interface BinaryMergeInPlaceFunction<T extends Comparable<? super T>> {

  void merge(T[] arr, int first, int middle, int last);
}
