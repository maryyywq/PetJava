public class Dog extends Pet implements Soundable {
    public Dog() { super(); }

    public Dog(String name, int age, Sex sex, Color color) {
        super(name, age, sex, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав!");
    }

    @Override
    public void walk(Weather weather)
    {
        super.walk(weather);
        makeSound();
    }
}

