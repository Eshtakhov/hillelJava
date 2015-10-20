package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class OrangePaint extends Paint {
    private  String color;
    private void setColor(){
        color="orange";
    }
    public String getColor(){
        setColor();
        return color;
    }
    public double paintConsumption(){
        return 0.3;
    }
}
