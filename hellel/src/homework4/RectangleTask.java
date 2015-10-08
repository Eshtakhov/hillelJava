package homework4;

public class RectangleTask {
    private double square;
    private double perimeter;


    public RectangleTask(double sq, double pr) {
        square = sq;
        perimeter = pr;
    }

    public boolean hasSolution() {
        return Math.sqrt(Math.pow(perimeter, 2) / 4 - 4 * square) > 0;
    }

    public Rectangle getRectangle() {
        if (hasSolution()) {
            double b = (perimeter / 2 + Math.sqrt(Math.pow(perimeter, 2) / 4 - 4 * square)) / 2;
            double a = square / b;
            Rectangle rectangle= new Rectangle(a, b);
                return rectangle;
            }
         else
            return null;
    }
}