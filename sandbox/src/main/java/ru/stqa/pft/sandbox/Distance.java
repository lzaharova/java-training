package ru.stqa.pft.sandbox;

public class Distance {
  public static void main(String[] args) {
    Point p = new Point(4, 8, 6, 9);
    p.d1= p.x2 - p.x1;
    p.d2= p.y2 - p.y1;
    System.out.println("Расстояние между двумя точками = " + distance(p));
  }

  public static double distance(Point p){
    return Math.sqrt(p.d1*p.d1 + p.d2*p.d2);
      }
}


