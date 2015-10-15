package OOP;

import java.util.Arrays;

/**
 * Created by ES on 08.10.2015.
 */
public class Animal {
   /* public static class Cat extends Animal1 {
        public static final boolean domestic=true;
        public static final boolean predoctor= true;

        boolean pet;*/
        String color;
      /*  public Cat(){

        }


        public Cat (boolean pet,int age, String name,String color){
            this.pet=pet;
            this.age=age;
            this.name=name;
            this.color=color;
        }
        public boolean equals(Cat otherCat){
            if(this.pet!=otherCat.pet) return false;
            if(age!=otherCat.age) return false;
            if(!name.equals(otherCat.name))return false;
            if(!color.equals(otherCat.color))return false;
            return true;
        }

        public String getSound() {
            return null;
        }



    }*/

    public static class OOP {
        static String sharedstring;//поле класса
        public static void main(String[] args) {
            int i=10;
            sharedstring="share string in maind";
            add(i);
            System.out.println(sharedstring);
            int [] ints={1,2,5};
            add(ints);
            System.out.println(Arrays.toString(ints)+" "+sharedstring);
            //sharedstring="some string";
        }

        private static void add(int[] ints) {
            ints[0]=3;
            ints[1]=5;
            ints[2]=115;
            sharedstring="share string after add ints[] method";
        }

        private static void add(int i) {
            i++;
            sharedstring="share string after add int method";
        }
        public static void printScipt()
        {
            System.out.println(sharedstring);
        }
    }
}
