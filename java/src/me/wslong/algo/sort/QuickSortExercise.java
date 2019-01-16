package me.wslong.algo.sort;

import me.wslong.algo.util.ArrayUtils;

public class QuickSortExercise {

  public static void main(String[] args) {
    int[] testArray = ArrayUtils.getRandomArray(10);
    ArrayUtils.print(testArray);
    doQuickSort(testArray, 0, testArray.length - 1);
    ArrayUtils.print(testArray);
  }

  private static int adjust(int[] src, int low, int high) {
    int temp = src[low];
    while (low < high) {
      while (low < high && temp <= src[high]) {
        high--;
      }
      src[low] = src[high];
      while (low < high && temp >= src[low]) {
        low++;
      }
      src[high] = src[low];
    }
    src[low] = temp;
    return low;
  }

  private static void doQuickSort(int[] array, int low, int high) {
    if (low < high) {
      int result = adjust(array, low, high);
      doQuickSort(array, low, result - 1);
      doQuickSort(array, result + 1, high);
    }

  }
}
