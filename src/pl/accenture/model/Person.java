package pl.accenture.model;

import java.util.function.Predicate;

public class Person {
    private  int age;
    private boolean isDriver;
    private boolean isPregnant;
    public Predicate<Person> canDrink = p -> ! p.isDriver && !p.isPregnant && p.age >= 18;

    public Person(int age, boolean isDriver, boolean isPregnant) {
        this.age = age;
        this.isDriver = isDriver;
        this.isPregnant = isPregnant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }
}
