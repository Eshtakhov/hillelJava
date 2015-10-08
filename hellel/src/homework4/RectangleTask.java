package homework4;

/**
 * Created by Евгений on 07.10.2015.
 */
public class RectangleTask {
    private double square;
    private double perimeter;
    private double a;
    private double b;

    public RectangleTask(double sq, double pr) {
        square = sq;
        perimeter = pr;
    }

    public boolean hasSolution() {
        if (Math.sqrt(Math.pow(perimeter, 2) / 4 - 4 * square) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Rectangle getRectangle() {
        if (hasSolution()) {
            b = (perimeter / 2 + Math.sqrt(Math.pow(perimeter, 2) / 4 - 4 * square)) / 2;
            a = square / b;
            Rectangle rectangle= new Rectangle(a, b);
                return rectangle;

            }

         else
            return null;
    }
}