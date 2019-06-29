package ru.stqa.pft.sandbox;

public class Distance {
  public static void main(String[] args) {
    Point p = new Point(4, 8, 6, 9);
    p.d1 = p.x2 - p.x1;
    p.d2 = p.y2 - p.y1;
    System.out.println("Расстояние между двумя точками c координатами" + " (" + p.x1 + ";" + p.y1 + ")" + " и " +
            "(" + p.x2 + ";" + p.y2 + ")" + " равно " + p.distance());
  }
}


