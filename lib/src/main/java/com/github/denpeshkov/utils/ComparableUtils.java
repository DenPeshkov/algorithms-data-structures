package com.github.denpeshkov.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
@SuppressWarnings("SameNameButDifferent")
public class ComparableUtils {

  public static <T extends Comparable<? super T>> boolean less(T o1, T o2) {
    return o1.compareTo(o2) < 0;
  }

  public static <T extends Comparable<? super T>> boolean lessOrEqual(T o1, T o2) {
    return o1.compareTo(o2) <= 0;
  }

  public static <T extends Comparable<? super T>> boolean greater(T o1, T o2) {
    return o1.compareTo(o2) > 0;
  }

  public static <T extends Comparable<? super T>> boolean greaterOrEqual(T o1, T o2) {
    return o1.compareTo(o2) >= 0;
  }

  public static <T extends Comparable<? super T>> boolean equal(T o1, T o2) {
    return o1.compareTo(o2) == 0;
  }
}
