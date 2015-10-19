package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Ellipse extends Figure {
    private double radBig;//,большая полуось элипса
    private double radSmall;//ментшаяе полуось элипса


    public Ellipse(double radiusbig, double radiussmall) {
        radBig = radiusbig;
        radSmall = radiussmall;

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
