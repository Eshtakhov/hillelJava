package homework4;

/**
 * Created by Евгений on 08.10.2015.
 */
public class Scarmbler {
    private String key;
    public Scarmbler(String key){
        this.key=key;
    }
    public String crypt(String message){
        while (message.length() > key.length()) {
            key = key + key;
        }
        char[] array = message.toCharArray();
        char[] keyarray = key.toCharArray();

        char[] result = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = (char) (array[i] ^ keyarray[i]);

        }
        String cipher = String.copyValueOf(result);
        return cipher;

    }

}
