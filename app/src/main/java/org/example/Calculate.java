package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int[] range(int x, int y) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = x; i <= y; i++) {
      list.add(i);
    }
    int[] array = list.stream().mapToInt(Integer::intValue).toArray();
    return array;
  }

  public int total(int[] x) {
    return Arrays.stream(x).sum();
  }

  public double ave(int[] x) {
    return Arrays.stream(x).average().getAsDouble();
  }

  public int[] odd(int[] x) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int score : x) {
      if (score % 2 == 1) {
        result.add(score);
      }
    }
    int[] array = result.stream().mapToInt(Integer::intValue).toArray();
    return array;
  }

  public int[] even(int[] x) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int score : x) {
      if (score % 2 == 0) {
        result.add(score);
      }
    }
    int[] array = result.stream().mapToInt(Integer::intValue).toArray();
    return array;
  }

  public void ans1(int x, int y) {
    Calculate calculate = new Calculate();
    int sum = calculate.sum(x, y);
    double ave = calculate.ave(calculate.range(x, y));
    System.out.printf("Sum of %d and %d is %d. Average is %.1f.\n", x, y, sum, (double) ave);
  }

  public void ans2(int x, int y) {
    Calculate calculate = new Calculate();
    int sum = calculate.total(calculate.range(x, y));
    double ave = calculate.ave(calculate.range(x, y));
    System.out.printf("Sum of %d to %d is %d. Average is %.1f.\n", x, y, sum, (double) ave);
  }

  public void ans3(int x, int y) {
    Calculate calculate = new Calculate();
    int oddsum = calculate.total(calculate.odd(calculate.range(x, y)));
    int evensum = calculate.total(calculate.even(calculate.range(x, y)));
    System.out.printf("Sum of odd of %d to %d is %d. sum of even is %d.\n", x, y, oddsum, evensum);
  }

}
