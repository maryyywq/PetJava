// Класс собаки
public class Dog extends Pet {

    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав!");
    }
}

