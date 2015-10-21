package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Square extends Figure implements PaintingFigure {
    private double a;
    private Paint paint = new RedPaint();


    public Square(double a) {
        this.a = a;

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
        return a * a;
    }

    @Override
    public double perimetre() {
        return 4 * a;

    }
}