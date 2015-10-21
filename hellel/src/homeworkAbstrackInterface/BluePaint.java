package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public class BluePaint extends Paint {

    @Override
    public String getColor(){

        return "blue";
    }
    @Override
    public double paintConsumption(){
        return 0.19;
    }
}
