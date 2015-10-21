package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class BrownPaint extends Paint {

    @Override
    public String getColor() {

        return "brown";
    }

    @Override
    public double paintConsumption() {
        return 0.26;
    }
}
