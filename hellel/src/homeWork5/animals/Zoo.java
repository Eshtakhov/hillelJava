package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Crocodile crock= new Crocodile("321",20,107.35,"green");
        System.out.println(crock.publishVoice());
        Lion leo=new Lion("512",15,250.65,"yellow");
        System.out.println(leo.publishVoice());
        Giraffe giraffe= new Giraffe("1000",3,500,"yellow-black");
        System.out.println(giraffe.publishVoice());
        Wolf wolf=new Wolf("22",2,45.5,"grey");
        System.out.println(wolf.publishVoice());
        Fish fish=new Fish("874",0,0.3,"Red-orange","Gold fish");
        System.out.println(fish.publishVoice());
        Hamster hamster=new Hamster("10115",1,0.15,"Brown","Homyak");
        System.out.println(hamster.publishVoice());
        Dog dog=new Dog("558",5,10.34,"Black","Rex");
        System.out.println(dog.publishVoice());
        Cat cat=new Cat("1",3,5.9,"Grey","Sony");
        System.out.println(cat.publishVoice());
        GuideDog dog1=new GuideDog("12",7,15,"Brown-grey","Finch",true);
        System.out.println(dog1.publishVoice());
        GuideDog dog2=new GuideDog("12",2,12,"White-grey","Jonny",false);
        System.out.println(dog2.publishVoice());
    }


}
