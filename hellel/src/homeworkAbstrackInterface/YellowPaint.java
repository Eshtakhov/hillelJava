package homeworkAbstrackInterface;

/**
 * Created by ������� on 14.10.2015.
 */
public class YellowPaint extends Paint{
    private  String color="yellow";
    @Override
    public String getColor(){
        return color;
    }
    public double paintConsumption(){
        return 0.28;
    }
}
