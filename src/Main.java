import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Чернушка", 2, Sex.FEMALE, Color.BLACK);
        Dog dog = new Dog("Мухтар", 5, Sex.MALE, Color.MULTI);
        Hamster hamster = new Hamster("Васька", 1, Sex.MALE, Color.RED);
        Food catFood = new Food("Whiskas", 30, 50, Cat.class);
        Food dogFood = new Food("Педигри", 40, 20, Dog.class);
        Food water = new Food("Вода", 0, 5, Pet.class);

        cat.use(catFood);
        cat.use(dogFood);
        hamster.use(water);
        System.out.println();

        dog.use(catFood);
        dog.use(dogFood);
        hamster.use(dogFood);
        System.out.println();

        List<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(hamster);
        for (Pet pet : petList)
        {
            if (pet instanceof Soundable) ((Soundable) pet).makeSound();
            else System.out.println(pet.getName() + " не умеет издавать звуки!");
        }

        System.out.println();
        cat.groom();

        System.out.println();
        System.out.println(dog);
        System.out.println();
        System.out.println(cat);
    }
}