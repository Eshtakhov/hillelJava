package homeworkAbstrackInterface;

/**
 * Created by ������� on 14.10.2015.
 */
public class BluePaint extends Paint {
    private  String color="blue";
    @Override
    public String getColor(){

        return color;
    }
    public double paintConsumption(){
        return 0.19;
    }
}
