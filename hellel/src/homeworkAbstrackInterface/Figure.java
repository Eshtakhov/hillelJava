package homeworkAbstrackInterface;

/**
 * Created by Евгений on 14.10.2015.
 */
public abstract class Figure implements Comparable<Figure>{
    public abstract Double area();
    public abstract  double perimetre();
    public int compareTo(Figure o) {
        return this.area().compareTo(o.area());
    }
}
