package com.github.denpeshkov.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
@SuppressWarnings("SameNameButDifferent")
public class ArrayUtils {

  public static <T> void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
