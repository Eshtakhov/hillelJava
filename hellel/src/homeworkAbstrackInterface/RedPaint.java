package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class RedPaint extends Paint {
    private String color = "red";

    @Override
    public String getColor() {

        return color;
    }

    public double paintConsumption() {
        return 0.23;
    }


}
