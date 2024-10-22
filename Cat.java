// Класс кошки
public class Cat extends Pet {

    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу!");
    }
}

