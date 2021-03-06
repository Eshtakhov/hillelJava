package homeworkAbstrackInterface;

/**
 * Created by ������� on 19.10.2015.
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
    public Double area() {
        double p = perimetre() / 2;
        return Math.abs(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimetre() {
        return (a + b + c);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        if (!(otherObject instanceof Triangle)) return false;
        Triangle other = (Triangle) otherObject;
        if (this.a != other.a) return false;
        if (this.b != other.b) return false;
        if (this.c != other.c) return false;
        return true;

    }
}

