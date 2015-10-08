package homework4;

/**
 * Created by Евгений on 08.10.2015.
 */
public class Scarmbler {
    private String key;

    public Scarmbler(String key) {
        this.key = key;
    }

    public String crypt(String message) {
        char[] array = message.toCharArray();
        char[] keyArray = key.toCharArray();

        char[] result = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i >= keyArray.length) {
                result[i] = (char) (array[i] ^ keyArray[i % keyArray.length]);
            } else {

                result[i] = (char) (array[i] ^ keyArray[i]);
            }
        }
        String cipher = String.copyValueOf(result);
        return cipher;

    }

}
