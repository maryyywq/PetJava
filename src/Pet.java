public abstract class Pet {
    protected String name = "";
    protected int age;
    protected Status status = new Status();
    protected Sex sex;
    protected Color color;

    public static final int EnergyCost = 5;
    public static final int healthCost = 5;
    public static final int satietyCost = 10;
    public static final int sleepHungerCost = 40;

    public Pet() { }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSatiety() {
        return status.getSatiety();
    }

    public int getEnergy() {
        return status.getEnergy();
    }

    public int getHealth() {
        return status.getHealth();
    }

    public Mood getMood() {
        return status.getMood();
    }

    public Sex getSex() { return sex; }

    public Color getColor() { return color; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSatiety(int satiety) {
        status.setSatiety(satiety);
    }

    public void setEnergy(int energy) {
        status.setEnergy(energy);
    }

    public void setHealth(int health) {
        status.setHealth(health);
    }

    public void setMood(Mood mood) {
        status.setMood(mood);
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void use(PetItem item) {
        if (item.getPetUser().equals(getClass()) || item.getPetUser().equals(Pet.class))
        {
            String className = item.getClass().getSimpleName();
            switch (className)
            {
                case "Food":
                    int newSatiety = status.getSatiety() + item.getValue();
                    status.setSatiety(newSatiety);
                    if (status.getSatiety() == Status.maxSatiety) {
                        status.setMood(Mood.HAPPY);
                    }
                    System.out.println(name + " покушал(а) " + item.getName() + " и его(ее) голод уменьшился.");
                    break;
                case "Medicine":
                    status.setHealth(status.getHealth() + item.getValue());
                    if (status.getHealth() > Status.maxHealth) {
                        status.setHealth(Status.maxHealth);
                        status.setMood(Mood.HAPPY);
                    }
                    System.out.println(name + " принял(а) " + item.getName() + " и его(ее) здоровье улучшилось.");
                    break;
                default:
                    break;
            }
        }
        else
        {
            System.out.println("Это не подходит вашему питомцу!");
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
        status.setEnergy(status.getEnergy() - EnergyCost);
        status.setSatiety(status.getSatiety() - satietyCost);
        if (status.getEnergy() < 0) status.setEnergy(0);
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
    }

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

