package me.wslong.algo.sort;

import me.wslong.algo.util.ArrayUtils;

public class InsertionSortExercise {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] src = ArrayUtils.getRandomArray(10);
    ArrayUtils.print(src);
    doInsertionSort(src);
    ArrayUtils.print(src);
  }

  private static void doInsertionSort(int[] array) {
    int len = array.length;

    for (int i = 1; i < len; i++) {
      int temp = array[i];
      int j;
      for (j = i; j > 0 && temp < array[j - 1]; j--) {
        array[j] = array[j - 1];
      }
      array[j] = temp;
    }
  }

}
