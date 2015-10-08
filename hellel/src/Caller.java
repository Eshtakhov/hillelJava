/**
 * Created by ES on 05.10.2015.
 */
public class Caller {
    public static void main(String[] args) {
        if(Cat.predoctor)
            System.out.println("Cat is predator");
        Cat tomcat= new Cat(true,3,"Tom","Grey");
        //tomcat.init(true,3,"Tom","Grey");




        Cat murzik=new Cat(true,4,"Murzik","Black");
       // murzik.init(true,4,"Murzik","Black");



        System.out.println(tomcat.name);
        System.out.println(murzik.predoctor);
    }

    public static void example() {
        OOP.printScipt();
        OOP.sharedstring="yahoo";
        OOP.printScipt();
    }
}
