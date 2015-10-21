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

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Paint)) return false;
        Paint other = (Paint) otherObject;
        if (this.paintConsumption() != other.paintConsumption()) return false;
        if (!this.getColor().equals(other.getColor())) return false;
        return true;

    }

}
