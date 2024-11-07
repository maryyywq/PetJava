import java.util.Random;

public class Owner {
    private String ownerName = "Некто";
    private int ownerAge;
    private int money;


    public Owner() { }


    public Owner(String ownerName, int ownerAge, int money) {
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
        this.money = money;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public int getMoney() {
        return money;
    }


    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя владельца не может быть пустым.");
        }
        this.ownerName = ownerName;
    }

    public void setOwnerAge(int ownerAge) {
        if (ownerAge <= 0) {
            throw new IllegalArgumentException("Возраст владельца должен быть положительным числом.");
        }
        this.ownerAge = ownerAge;
    }

    public void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("Количество денег не может быть отрицательным.");
        }
        this.money = money;
    }

    public void pet(Pet pet)
    {
        Random r = new Random();
        int randNum = r.nextInt(100) + 1;
        if (randNum <= 60)
        {
            pet.setMood(Mood.HAPPY);
            System.out.println(pet.getName() + " радуется от того, что вы его (её) погладили!");
        }
        else
        {
            pet.setMood(Mood.ANGRY);
            System.out.println(pet.getName() + " злится! Он (она) не в настроении!");
        }
    }

    public void play(Pet pet, Game game)
    {
        if (pet.getEnergy() >= game.getEnergyCost()) {
            pet.setMood(Mood.HAPPY);
            pet.setEnergy(pet.getEnergy() - game.getEnergyCost());
            pet.setSatiety(pet.getSatiety() - Pet.satietyCost);
            System.out.println(game.getDescription());
            System.out.println(pet.getName() + " поиграл(а) в " + game.getGameName() + " и очень счастлив(а)!");
        } else {
            System.out.println(pet.getName() + " слишком устал(а) для игры.");
        }
    }
}

