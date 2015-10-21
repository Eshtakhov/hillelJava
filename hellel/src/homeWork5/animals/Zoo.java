package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        animal crock = new Crocodile("321", 20, 107.35, "green", true);
        System.out.println(crock.publishVoice());
        animal leo = new Lion("512", 15, 250.65, "yellow",true);
        System.out.println(leo.publishVoice());
        animal giraffe = new Giraffe("1000", 3, 500, "yellow-black",false);
        System.out.println(giraffe.publishVoice());
        Wolf wolf = new Wolf("22", 2, 45.5, "grey",true);
        System.out.println(wolf.publishVoice());
        Fish fish = new Fish("874", 0, 0.3, "Red-orange", "Gold fish",false);
        System.out.println(fish.publishVoice());
        Hamster hamster = new Hamster("10115", 1, 0.15, "Brown", "Homyak",false);
        System.out.println(hamster.publishVoice());
        Dog dog = new Dog("558", 5, 10.34, "Black", "Rex",true);
        System.out.println(dog.publishVoice());
        Cat cat = new Cat("1", 3, 5.9, "Grey", "Sony",true);
        System.out.println(cat.publishVoice());
        GuideDog dog1 = new GuideDog("12", 7, 15, "Brown-grey", "Finch", true,true);
        System.out.println(dog1.publishVoice());
        GuideDog dog2 = new GuideDog("12", 2, 12, "White-grey", "Jonny",true, false);
        System.out.println(dog2.publishVoice());
    }


}
