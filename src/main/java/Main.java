import factories.AnimalFactory;
import factories.BalanceAnimalFactory;
import factories.RandomAnimalFactory;
import models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a farm with random animal factory.");
        System.out.println("We gonna create 6 animals here.");
        AnimalFactory randomAnimalFactory = new RandomAnimalFactory();

        List<Animal> animalsInRandomFarm = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
            animalsInRandomFarm.add(randomAnimalFactory.createAnimal());
            System.out.println("We have " + animalsInRandomFarm.get(i) + " in random farm.");
            animalsInRandomFarm.get(i).makeNoise();
        }

        System.out.println("This is a farm with balance animal factory.");
        System.out.println("We gonna create 6 animals here.");
        AnimalFactory balanceAnimalFactory = new BalanceAnimalFactory();

        List<Animal> animalsInBalanceFarm = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
            animalsInBalanceFarm.add(balanceAnimalFactory.createAnimal());
            System.out.println("We have " + animalsInBalanceFarm.get(i) + " in balance farm.");
            animalsInRandomFarm.get(i).makeNoise();
        }
    }
}
