package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class GuideDog extends Menage {
    private boolean isTrained;

    public GuideDog(String id, int age, double weight, String color, String name,boolean isTrained) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
        isVactinated = true;
        this.isTrained=isTrained;
    }
    public boolean comeHome(){
        if (isTrained) return true;
        else return false;
    }


    @Override
    public String publishVoice() {
        if(comeHome()){
        String string = "Hello, my name is " + name + "\n" + "I can take you home";
        return string;}
        else {
            String string = "Hello, my name is " + name + "\n" ;
            return string;}
        }

    }


