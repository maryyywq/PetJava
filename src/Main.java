//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pet myCat = new Cat();
        Pet myDog = new Dog();
        Parrot myParrot = new Parrot();

        myCat.makeSound();
        myDog.makeSound();
        myParrot.makeSound();
        myParrot.learnNewSound(new BarkSound());
        myParrot.makeSound();

        myCat.move();
        myDog.move();
        myParrot.move();
    }
}