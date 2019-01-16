package me.wslong.algo.sort;

import me.wslong.algo.util.ArrayUtils;

public class SelectionSortExercise {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] src = ArrayUtils.getRandomArray(10);
    ArrayUtils.print(src);

    doSelectionSort(src);
    ArrayUtils.print(src);
  }

  private static void doSelectionSort(int[] src) {
    int len = src.length;
    int temp;
    int smallestLocation;
    for (int i = 0; i < len; i++) {
      temp = src[i];
      smallestLocation = i;
      for (int j = i + 1; j < len; j++) {
        if (temp > src[j]) {
          temp = src[j];
          smallestLocation = j;
        }
      }
      src[smallestLocation] = src[i];
      src[i] = temp;
    }
  }
}
