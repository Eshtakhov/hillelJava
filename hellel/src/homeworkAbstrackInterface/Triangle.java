package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Triangle extends Figure implements PaintingFigure {
    private double a;
    private double b;
    private double c;
    private Paint paint = new OrangePaint();

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        double p = perimetre() / 2;
        return Math.abs(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimetre() {
        return (a + b + c);
    }
}

