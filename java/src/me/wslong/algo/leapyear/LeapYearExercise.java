package me.wslong.algo.leapyear;

public class LeapYearExercise {

  public static void main(String[] args) {
    boolean isLeapYear;
    System.out.println("Leap years have... (between 1000 and 2500)");
    for (int i = 1900; i <= 2000; i++) {
      isLeapYear = false;
      if (i % 100 == 0) {
        if (i % 400 == 0) {
          isLeapYear = true;
        }
      } else {
        if (i % 4 == 0) {
          isLeapYear = true;
        }
      }
      if (isLeapYear) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

}
