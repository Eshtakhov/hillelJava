package homeworkAbstrackInterface;


public abstract class Paint implements Comparable{

    public abstract double paintConsumption();
    public abstract String getColor();


    @Override
    public int compareTo(Object otherObject) {
        if (!(otherObject instanceof Paint)) return -1;
        Paint other = (Paint) otherObject;
        return this.getColor().compareTo(other.getColor());

    }

}
