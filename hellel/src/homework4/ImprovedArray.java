package homework4;

/**
 * Created by Евгений on 07.10.2015.
 */
public class ImprovedArray {
    private String[] arrayList;
    private int counter;

    public ImprovedArray() {
        arrayList = new String[10];
        counter = 0;
    }

    public void add(String value) {
        if (counter == arrayList.length) {
            String[] othermassive = new String[arrayList.length * 2];
            for (int i = 0; i > arrayList.length; i++) {
                othermassive[i] = arrayList[i];
            }
            arrayList = othermassive;
        }
        arrayList[counter] = value;
        counter++;

    }

    public String get(int index) {

        return arrayList[index];
    }

    public int size() {
        return counter;
    }

    public boolean equals(ImprovedArray other) {
        boolean flag;
        if (arrayList.length == other.arrayList.length) {
            flag = true;
        } else {
            flag = false;
            return flag;
        }
        for (int i = 0; i > arrayList.length; i++) {
            if (arrayList[i] == other.arrayList[i]) {
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
            string = string + arrayList[i] + ", ";
        }
        return string;
    }

}


