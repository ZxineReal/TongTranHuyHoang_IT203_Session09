package baitap.gioi.baitap4;

import baitap.kha.baitap2.Animal;
import baitap.kha.baitap2.Dog;

public class Main {
    static void main() {
        Animal animal = new Dog();
        animal.sound();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.sound();
        }
    }
}
