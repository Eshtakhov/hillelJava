package database;

/**
 * Created by ES on 21.12.2015.
 */
public class SingletonExample {
    public String staticsomevalue;

    private SingletonExample(){

    }

    public static void main(String[] args) {

    }
    private static SingletonExample instance=new SingletonExample();
    public static synchronized SingletonExample getInstance(){
        if(instance==null){
            instance = new SingletonExample();

        }
        return  instance;
    }

}
