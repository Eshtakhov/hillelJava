package homeworkAbstrackInterface;

/**
 * Created by ≈вгений on 19.10.2015.
 */
public class Parallelogram extends Figure implements PaintingFigure {
    private double a;//сторона паралелограма
    private double b;//сторона паралелограма
    private double alfa;//угол между сторонами(любой из двух)
    private Paint paint = new BrownPaint();

    public Parallelogram(double a, double b, double alfa) {
        this.a = a;
        this.b = b;
        this.alfa = alfa;
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

        return Math.sin(alfa) * a * b;
    }

    @Override
    public double perimetre() {
        return (a + b) * 2;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        if (!(otherObject instanceof Parallelogram)) return false;
        Parallelogram other = (Parallelogram) otherObject;
        if (this.a != other.a) return false;
        if (this.b != other.b) return false;
        if (this.alfa != other.alfa) return false;
        return true;

    }

}
