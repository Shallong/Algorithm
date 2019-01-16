package me.wslong.algo.array;

import me.wslong.algo.util.ArrayUtils;

public class ReverseArrayExercise {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] src = ArrayUtils.getRandomArray(10);

    ArrayUtils.print(src);
    doReverse(src);
    ArrayUtils.print(src);
  }

  private static void doReverse(int[] array) {
    int len = array.length;
    for (int i = 0; i < len / 2; i++) {
      int temp = array[i];
      array[i] = array[len - 1 - i];
      array[len - 1 - i] = temp;
    }
  }

}
