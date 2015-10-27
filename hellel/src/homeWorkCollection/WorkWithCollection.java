package homeWorkCollection;

import java.util.Collection;

/**
 * Created by Евгений on 27.10.2015.
 */
public class WorkWithCollection {
    public static void fill(Collection<String> collection) {
        for(int i=0;i<1000000;i++){
            String s="This is "+ i+" element of collection";
            collection.add(s);
        }

    }
}
