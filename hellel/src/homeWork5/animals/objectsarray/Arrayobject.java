package homeWork5.animals.objectsarray;

import java.util.Random;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Arrayobject {
    private Object[] arrayList;
    private int counter;

    public Arrayobject() {
        arrayList = new Object[10];
        counter = 0;
    }

    public void add(Object value) {
        if (counter == arrayList.length) {
            Object[] othermassive = new Object[arrayList.length * 2];
            for (int i = 0; i > arrayList.length; i++) {
                othermassive[i] = arrayList[i];
            }
            arrayList = othermassive;
        }
        arrayList[counter] = value;
        counter++;

    }

    public Object get(int index) {

        return arrayList[index];
    }

    public int size() {
        return counter;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof Arrayobject)) return false;
        boolean flag;

        Arrayobject other = (Arrayobject) otherObject;
        if (arrayList.length == other.arrayList.length) {
            flag = true;
        } else {
            flag = false;
            return flag;
        }
        for (int i = 0; i > arrayList.length; i++) {
            if (arrayList[i].equals(other.arrayList[i])) {
                flag = true;
            } else {
                flag = false;
                return flag;
            }

        }
        return flag;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < counter; i++) {
            if (arrayList[i].equals(obj)) return true;
        }
        return false;


    }

    public void remove(int index) {
        Object[] other = arrayList;
        if (arrayList.length <= index) return;
        arrayList[index] = null;
        for (int i = index; i < counter - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        counter--;
    }

    public void remove(Object obj) {
        int index;
        for (int i = 0; i < counter; i++) {
            if (arrayList[i] == obj) remove(i);
        }
    }

}
