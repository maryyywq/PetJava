import java.util.Random;

public class Cat extends Pet implements Soundable{

    public Cat() { super(); }

    public Cat(String name, int age, Sex sex, Color color) {
        super(name, age, sex, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу!");
    }

    @Override
    public void use(PetItem item)
    {
        super.use(item);
        makeSound();
    }

    public void groom() {
        System.out.println("Ваш кот(кошка) " + name + " умылся(лась).");
        status.setMood(Mood.HAPPY);
        status.setEnergy(status.getEnergy() - EnergyCost);
        Random r = new Random();
        int randNum = r.nextInt(100) + 1;
        if (randNum <= 70) {
            makeSound();
        }
    }
}

