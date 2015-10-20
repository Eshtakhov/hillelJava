package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Rectangle extends Figure implements PaintingFigure {
    private double a;
    private double b;
    private Paint paint = new BluePaint();


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String paintingColor() {

        return paint.getColor();

    }

    @Override
    public double amountOfInk() {
        return paint.paintConsumption() * area();
    }


    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimetre() {
        return 2 * (a + b);
    }
}
