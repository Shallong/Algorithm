package me.wslong.algo.util;

import java.util.Random;

public class ArrayUtils {

  public static void print(int[] src) {
    for (int i = 0; i < src.length; i++) {
      System.out.print(src[i]);
      System.out.print(" ");
    }
    System.out.println();
  }

  public static int[] getRandomArray(int n) {
    int[] result = new int[n];
    Random r = new Random(System.currentTimeMillis());
    for (int i = 0; i < result.length; i++) {
      result[i] = r.nextInt(100) + 1;
    }
    return result;
  }
}
