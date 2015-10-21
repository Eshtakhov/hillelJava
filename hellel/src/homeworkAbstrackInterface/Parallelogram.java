package homeworkAbstrackInterface;

/**
 * Created by ������� on 19.10.2015.
 */
public class Parallelogram extends Figure implements PaintingFigure {
    private double a;//������� �������������
    private double b;//������� �������������
    private double alfa;//���� ����� ���������(����� �� ����)
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
    public double area() {

        return Math.sin(alfa) * a * b;
    }

    @Override
    public double perimetre() {
        return (a + b) * 2;
    }

}