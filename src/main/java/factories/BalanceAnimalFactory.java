package factories;

import models.Animal;
import models.Cat;
import models.Dog;
import models.Duck;

import java.util.Random;

public class BalanceAnimalFactory implements AnimalFactory {
    int dogCounter = 0;
    int catCounter = 0;
    int duckCounter = 0;

    @Override
    public Animal createAnimal() {
        boolean flag = true;

        Animal animal = null;

        Random random = new Random();

        while(flag) {
            int n = random.nextInt(3);

            switch (n) {
                case 0: {
                    if(dogCounter == 0) {
                        dogCounter++;
                        animal = new Dog();
                        flag = false;
                        break;
                    } else {
                        if(dogCounter < catCounter || dogCounter < duckCounter || (dogCounter == catCounter && dogCounter == duckCounter)) {
                            dogCounter++;
                            animal = new Dog();
                            flag = false;
                        }
                        break;
                    }
                }
                case 1: {
                    if(catCounter == 0) {
                        catCounter++;
                        animal = new Cat();
                        flag = false;
                        break;
                    } else {
                        if(catCounter < dogCounter || catCounter < duckCounter || (catCounter == dogCounter && catCounter == duckCounter)) {
                            catCounter++;
                            animal = new Cat();
                            flag = false;
                        }
                        break;
                    }
                }
                case 2: {
                    if(duckCounter == 0) {
                        duckCounter++;
                        animal = new Duck();
                        flag = false;
                        break;
                    } else {
                        if((duckCounter < dogCounter || duckCounter < catCounter) || (duckCounter == dogCounter && duckCounter == catCounter)) {
                            duckCounter++;
                            animal = new Duck();
                            flag = false;
                        }
                        break;
                    }
                }
            }
        }

        return animal;
    }
}
