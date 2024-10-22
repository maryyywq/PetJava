// Абстрактный класс питомца
abstract class Pet {
    protected String name;
    protected int age;
    protected Status status;

    public Pet() {
        this.name = "";
        this.age = 0;
        this.status = new Status();
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.status = new Status();
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Status getStatus() {
        return status;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Абстрактный метод для звука питомца
    public abstract void makeSound();

    public void use(PetItem item) {
        if (item.getType().equals("Food")) {
            int newSatiety = status.getSatiety() + item.getValue();
            status.setSatiety(newSatiety);
            if (status.getSatiety() == Status.maxSatiety) {
                status.setMood(Mood.HAPPY);
            }
            System.out.println(name + " покушал(а) " + item.getName() + " и его(ее) голод уменьшился.");
            makeSound(); // Питомец издает звук после еды
        } else if (item.getType().equals("Medicine")) {
            status.setHealth(status.getHealth() + item.getValue());
            if (status.getHealth() > Status.maxHealth) {
                status.setHealth(Status.maxHealth);
                status.setMood(Mood.HAPPY);
            }
            System.out.println(name + " принял(а) " + item.getName() + " и его(ее) здоровье улучшилось.");
        }
    }

    public void play(Game game) {
        if (status.getEnergy() >= game.getEnergyCost()) {
            status.setMood(Mood.HAPPY);
            status.setEnergy(status.getEnergy() - game.getEnergyCost());
            status.setSatiety(status.getSatiety() - satietyCost);
            System.out.println(name + " поиграл(а) и очень счастлив(а)!");
            makeSound(); // Питомец издает звук после игры
        } else {
            System.out.println(name + " слишком устал(а) для игры.");
        }
    }

    public void walk(Weather weather) {
        if (weather == Weather.STORM || weather == Weather.RAINY || weather == Weather.WINDY) {
            status.setMood(Mood.AFRAID);
            status.setHealth(status.getHealth() - healthCost);
            if (status.getHealth() < 0) status.setHealth(0);
            System.out.println(name + " испугался(ась) из-за плохой погоды.");
        } else {
            status.setMood(Mood.HAPPY);
            System.out.println(name + " гуляет и наслаждается хорошей погодой.");
        }
        status.setEnergy(status.getEnergy() - walkEnergyCost);
        status.setSatiety(status.getSatiety() - satietyCost);
        if (status.getEnergy() < 0) status.setEnergy(0);

        makeSound(); // Питомец издает звук после прогулки
    }

    public void sleep(PetHouse house) {
        status.setEnergy(status.getEnergy() + house.getComfortLevel());
        status.setSatiety(status.getSatiety() - sleepHungerCost);
        if (status.getEnergy() > Status.maxEnergy) {
            status.setEnergy(Status.maxEnergy);
        }

        if (status.getEnergy() >= 50) {
            System.out.println(name + " хорошо отдохнул(а)!");
            status.setMood(Mood.HAPPY);
        } else {
            System.out.println(name + " не очень хорошо отдохнул(а) :(");
            status.setMood(Mood.SAD);
        }
        makeSound(); // Питомец издает звук после сна
    }

    public static final int walkEnergyCost = 5;
    public static final int healthCost = 5;
    public static final int satietyCost = 10;
    public static final int sleepHungerCost = 40;

    @Override
    public String toString() {
        return "Имя питомца: " + name + "\n" +
                "Возраст питомца: " + age + "\n" +
                "Сытость: " + status.getSatiety() + "\n" +
                "Энергия: " + status.getEnergy() + "\n" +
                "Здоровье: " + status.getHealth() + "\n" +
                "Настроение: " + status.getMood();
    }
}

