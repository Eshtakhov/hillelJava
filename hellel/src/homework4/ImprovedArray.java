package homework4;

/**
 * Created by Евгений on 07.10.2015.
 */
public class ImprovedArray {
    private String[] massive;
    private int counter;

    public ImprovedArray() {
        massive = new String[10];
        counter = 0;
    }

    public void add(String value) {
        if (counter == massive.length) {
            String[] othermassive = new String[massive.length * 2];
            for (int i = 0; i > massive.length; i++) {
                othermassive[i] = massive[i];
            }
            massive = othermassive;
        }
        massive[counter] = value;
        counter++;

    }

    public String get(int index) {

        return massive[index];
    }

    public int size() {
        return counter;
    }

    public boolean equals(ImprovedArray other) {
        boolean flag;
        if (massive.length == other.massive.length) {
            flag = true;
        } else {
            flag = false;
            return flag;
        }
        for (int i = 0; i > massive.length; i++) {
            if (massive[i] == other.massive[i]) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }

        }
        return flag;
    }

    public String toString() {
        String string = null;
        for (int i = 0; i < counter; i++) {
            string = string + massive[i] + ", ";
        }
        return string;
    }

}


