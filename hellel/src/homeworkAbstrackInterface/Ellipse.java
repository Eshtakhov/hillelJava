package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Ellipse extends Figure implements PaintingFigure {
    private double radBig;//,большая полуось элипса
    private double radSmall;//ментшаяе полуось элипса
    private Paint paint = new GreenPaint();

    public Ellipse(double radiusbig, double radiussmall) {
        radBig = radiusbig;
        radSmall = radiussmall;

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

        return Math.PI * radSmall * radBig;
    }

    @Override
    public double perimetre() {
        return 4 * (Math.PI * radBig * radSmall + Math.pow(radBig - radSmall, 2)) / (radSmall + radBig);
    }
}
