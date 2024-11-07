import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Чернушка", 2, Sex.FEMALE, Color.BLACK);
        PetHouse cathouse = new PetHouse("Теплая кровать", "ул.Ленина, 52", 70 );
        Dog dog = new Dog("Мухтар", 5, Sex.MALE, Color.MULTI);
        PetHouse doghouse = new PetHouse("Будка", "ул.Партизанская, 101", 30 );
        Hamster hamster = new Hamster("Васька", 1, Sex.MALE, Color.RED);
        PetHouse hamsterhouse = new PetHouse("Клетка", "пр-т Космонавтов, 87", 70 );
        System.out.println(PetHouse.getHouseCount() + " домика(ов) для животных!\n");

        try {
            // Создание нового питомца с корректными данными
            Cat kitten = new Cat("Мурка", 3, Sex.FEMALE, Color.WHITE);

            // Попытка создать питомца с некорректным именем
            Dog puppy = new Dog("", 2, Sex.MALE, Color.RED); //Пустое имя вызовет исключение

            //Попытка создать питомца с некорректным возрастом
            Hamster hamster1 = new Hamster("Хомяк", -1, Sex.MALE, Color.WHITE); //Неверный возраст вызовет исключение

            System.out.println(kitten + "\n");

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании питомца: " + e.getMessage());
        }

        System.out.println(cat);
    }
}