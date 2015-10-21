package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Trapeze extends Figure implements PaintingFigure {
    private double a;//меньшее основание трапеции
    private double b;//большее рснование трапеции
    private double c;//боковая сторона трапеции
    private double d;//боковая сторона трапеции
    private Paint paint = new YellowPaint();


    public Trapeze(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

        return (a + b) / 2 * Math.abs(Math.pow(c, 2) - (Math.pow(a - b, 2) + Math.pow(c, 2)
                - Math.pow(d, 2)) / (2 * (a - b)));
    }

    @Override
    public double perimetre() {
        return (a + b + c + d);
    }
}
