//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Food catFood = new Food();
        Food dogFood = new Food();

        catFood.setPetUser(Cat.class);
        dogFood.setPetUser(Dog.class);
        cat.use(catFood);
        cat.use(dogFood);

        dog.use(catFood);
        dog.use(dogFood);

        Food universalFood = new Food();
        cat.use(universalFood);
        dog.use(universalFood);
    }
}