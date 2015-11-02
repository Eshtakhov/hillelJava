package collections.multableStatr;

import OOP.Cat;

import java.util.Objects;

/**
 * Created by ES on 02.11.2015.
 */
public class Car {
    final String model;
    final int age;

    public Car(String model, int age){
        this.model=model;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(age, car.age) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, age);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
