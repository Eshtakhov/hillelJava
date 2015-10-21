package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class RedPaint extends Paint {

    @Override
    public String getColor() {

        return "red";
    }

    public double paintConsumption() {
        return 0.23;
    }


}
