package homeworkAbstrackInterface;

/**
 * Created by ������� on 14.10.2015.
 */
public class GreenPaint extends Paint {

    @Override
    public String getColor() {

        return "green";
    }

    @Override
    public double paintConsumption() {
        return 0.2;
    }
}
