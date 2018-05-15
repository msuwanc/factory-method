package models;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bok bok!");
    }
}
