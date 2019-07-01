package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(4, 6);
    Point p2 = new Point(8, 9);
    Assert.assertEquals(5.0, p1.distance(p2));

  }
}
