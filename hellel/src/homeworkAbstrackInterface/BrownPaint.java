package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class BrownPaint extends Paint {
    private  String color="brown";
    @Override
    public String getColor(){

        return color;
    }
    public double paintConsumption(){
        return 0.26;
    }
}
