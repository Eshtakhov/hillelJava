package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class BluePaint extends Paint {
    private  String color;
    private void setColor(){
        color="blue";
    }
    public String getColor(){
        setColor();
        return color;
    }
    public double paintConsumption(){
        return 0.19;
    }
}
