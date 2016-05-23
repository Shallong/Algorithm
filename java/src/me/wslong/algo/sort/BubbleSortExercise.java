package me.wslong.algo.sort;

import me.wslong.algo.util.ArrayUtils;

public class BubbleSortExercise {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] src = ArrayUtils.getRandomArray(10);
    ArrayUtils.print(src);

    doBubbleSort(src);
    ArrayUtils.print(src);

  }

  private static void doBubbleSort(int[] src) {
    int len = src.length;
    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        if (src[i] > src[j]) {
          int temp = src[i];
          src[i] = src[j];
          src[j] = temp;
        }
      }
    }
  }

}
