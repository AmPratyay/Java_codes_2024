package programming_pathsala.rough_practice.oops1Rough;

import java.util.ArrayList;
import java.util.List;

public class TesterAnimal {

    public static void printDetails(List<Animal> animals){

        for (Animal animal : animals){
            animal.makeSound();
        }

    }

    public static void main(String[] args) {
        Animal a = new Cat();
        Animal a2 = new Dog();

        Animal a3 = new Dog();
        Dog d = (Dog)a3;

        List<Animal> animals = new ArrayList<>();
        animals.add(a);
        animals.add(a2);

        printDetails(animals);

    }
}
