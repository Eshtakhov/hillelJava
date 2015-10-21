package homeworkAbstrackInterface;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Circle extends Figure implements PaintingFigure {
    private double radius;
    private Paint paint = new YellowPaint();


    public Circle(double radius) {
        this.radius = radius;
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
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * radius;

    }
    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject))return false;
        if (!(otherObject instanceof Circle)) return false;
        Circle other = (Circle) otherObject;
        if (this.radius != other.radius) return false;
        return true;

    }
}