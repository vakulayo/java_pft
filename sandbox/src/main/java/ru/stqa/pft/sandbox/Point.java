package ru.stqa.pft.sandbox;

/**
 * Created by user on 4/26/16.
 */
public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
   this.x=x;
    this.y=y;
  }

  public double distToPoint (Point d){
    return Math.sqrt((this.x - d.x)*(this.x - d.x)+(this.y - d.y)*(this.y - d.y));
  }


}
