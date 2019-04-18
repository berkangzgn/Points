import java.awt.*;
public class Pointer {
    private double x;
    private double y;

    public Pointer(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public static Point findFurthest(Point [] pointArray){
        Point p = pointArray[0];
        for (int i = 0; i < pointArray.length; i++) {
            if (pointArray[i].distance(p) < p.distance(p)) {
                p = pointArray[i];
            }
        }
        return Math.sqrt((p.x - this.x) * (p.x - this.x) +
                (p.y - this.y) * (p.y - this.y));
    }







    /*public Point findClosest(Point[] pointArray) {
        float x1, y1, x2 , y2;
        System.out.println();
        return Math.sqrt((((x1-x) * (x1-x)) + ((y1- y) * (y1- y))));
    }*/

}
