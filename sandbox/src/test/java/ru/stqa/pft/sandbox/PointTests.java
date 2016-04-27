package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 4/27/16.
 */
public class PointTests {


  @Test
  public void testDistance1(){
    Point a = new Point(0,0);
    Point b = new Point(0,0);
    Assert.assertEquals(a.distToPoint(b), 0.0);
  }

  @Test
  public void testDistance2(){
    Point a = new Point(0,0);
    Point b = new Point(3,4);
    Assert.assertEquals(a.distToPoint(b), 5.0);
  }

  @Test
  public void testDistance3(){
    Point a = new Point(-3,-1);
    Point b = new Point(0,-5);
    Assert.assertEquals(a.distToPoint(b), 5.0);
  }

  @Test
  public void testDistance4(){
    Point a = new Point(-3,3);
    Point b = new Point(3,-3);
    Assert.assertEquals(a.distToPoint(b), 6.0*Math.sqrt(2),0.0000000000001);
  }


  @Test
  public void testDistance5(){
    Point a = new Point(0,0.0000000000001);
    Point b = new Point(94864,20148.0000000000001);
    Assert.assertEquals(a.distToPoint(b), 96980.0);
  }



}
