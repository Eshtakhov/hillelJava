public class Cat {
    public static final boolean domestic=true;
    public static final boolean predoctor= true;

    boolean pet;
    int age;
    String name;
    String color;
    public Cat(){
        System.out.println("construct");
    }


    public Cat (boolean pet,int age, String name,String color){
        this.pet=pet;
        this.age=age;
        this.name=name;
        this.color=color;
    }

}
