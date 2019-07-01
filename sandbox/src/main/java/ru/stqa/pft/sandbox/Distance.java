package ru.stqa.pft.sandbox;


public class Distance {

  public static void main(String[] args) {
    Point p1 = new Point(4, 6);
    Point p2 = new Point(8, 9);
    System.out.println("p1 = " + p1.x + ", " + p1.y);
    System.out.println("p2 = " + p2.x + ", " + p2.y);
    System.out.println("Расстояние между двумя точками c координатами" + " (" + p1.x + ";" + p1.y + ")" + " и " +
            "(" + p2.x + ";" + p2.y + ")" + " равно " + p1.distance(p2));
  }
}






