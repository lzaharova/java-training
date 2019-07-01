package ru.stqa.pft.sandbox;

public class Point {
<<<<<<< HEAD
  public double x;
  public double y;
  public double dx;
  public double dy;


  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(double x, double y) {
    dx = this.x - x;
    dy = this.y - y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public double distance(Point p) {
    return distance(p.x, p.y);
  }
}
=======
    public double x;
    public double y;
    public double dx;
    public double dy;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        dx = this.x - x;
        dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(Point p) {
        return distance(p.x, p.y);
    }
}


>>>>>>> 9a37c6a6014523d499a985dfa32b0d3185fcd903
