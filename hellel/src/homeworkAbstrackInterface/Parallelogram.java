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

}
