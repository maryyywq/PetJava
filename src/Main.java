//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pet myCat = new Cat("Чернь", 3, Sex.FEMALE, Color.BLACK);
        Pet myParrot = new Parrot("Попка", 4, Sex.MALE, Color.getRandomColor());

        PetItem item1 = new Food("Сникерс", 20, 60, Parrot.class);
        PetItem item2 = new Medicine("Нурафен", 40, 50, Pet.class);

        Owner marina = new Owner("Мария", 19, 1000);

        marina.addPet(myCat);
        marina.addPet(myParrot);
        marina.addItem(item1);
        marina.addItem(item2);

        System.out.println(marina);

        Pet pet1 = marina.getPet("Чернь");
        System.out.println(pet1 + "\n");

        Pet pet2 = marina.getPet("Санек");

        marina.sortItemsByValue();
        System.out.println("\nПосле сортировки по значимости:");
        System.out.println(marina);

        marina.sortItemsByCost();
        System.out.println("После сортировки по стоимости:");
        System.out.println(marina);

        Parrot parrot = new Parrot("Попка", 4, Sex.MALE, Color.getRandomColor());
        parrot.learnNewSound("Привет!");
        parrot.makeRandomSound();
    }
}