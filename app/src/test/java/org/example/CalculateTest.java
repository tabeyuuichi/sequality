package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testRange() {
    Calculate calculate = new Calculate();
    int expected[] = { 2, 3, 4, 5 };
    assertArrayEquals(expected, calculate.range(2, 5));
  }

  @Test
  public void testTotal() {
    Calculate calculate = new Calculate();
    int expected = 15;
    assertEquals(expected, calculate.total(new int[] { 1, 2, 3, 4, 5 }));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 3.0;
    assertEquals(expected, calculate.ave(new int[] { 1, 2, 3, 4, 5 }), 0);
  }

  @Test
  public void testOdd() {
    Calculate calculate = new Calculate();
    int expected[] = { 1, 3, 5 };
    assertArrayEquals(expected, calculate.odd(new int[] { 1, 2, 3, 4, 5 }));
  }

  @Test
  public void testEven() {
    Calculate calculate = new Calculate();
    int expected[] = { 2, 4 };
    assertArrayEquals(expected, calculate.even(new int[] { 1, 2, 3, 4, 5 }));
  }

}
