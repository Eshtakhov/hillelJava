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
        if (sq > 0) {
            square = sq;
        } else {
            System.out.println("Wrong square");
        }
        if (pr > 0) {
            perimeter = pr;
        } else {
            System.out.println("Wrong perimeter");
        }

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
            Rectangle rectangle = new Rectangle(a, b);
            if ((b > 0) && (a > 0)) {
                return rectangle;
            } else {
                b = (perimeter / 2 - Math.sqrt(Math.pow(perimeter, 2) / 4 - 4 * square)) / 2;
                a = square / b;
                if ((b > 0) && (a > 0)) {
                    return rectangle;
                } else {
                    return null;
                }

            }

        }
        else return null;
    }
}