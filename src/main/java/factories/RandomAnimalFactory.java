package factories;

import models.Animal;
import models.Cat;
import models.Dog;
import models.Duck;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        Animal animal = null;

        Random random = new Random();

        int n = random.nextInt(3);

        switch (n) {
            case 0:
                animal = new Dog();
                break;
            case 1:
                animal = new Cat();
                break;
            case 2:
                animal = new Duck();
                break;
        }

        return animal;
    }
}
