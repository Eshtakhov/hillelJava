package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class GreenPaint extends Paint {
    private  String color="green";

    public String getColor(){

        return color;
    }
    public double paintConsumption(){
        return 0.2;
    }
}
