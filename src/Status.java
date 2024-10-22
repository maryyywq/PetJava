public class Status {
    private int satiety;
    private int energy;
    private int health;
    private Mood mood;


    public static final int maxEnergy = 100;
    public static final int maxHealth = 100;
    public static final int maxSatiety = 100;


    public Status() {
        this.satiety = maxSatiety;
        this.energy = maxEnergy / 2;
        this.health = maxHealth;
        this.mood = Mood.HAPPY;
    }


    public int getSatiety() {
        return satiety;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHealth() {
        return health;
    }

    public Mood getMood() {
        return mood;
    }


    public void setSatiety(int satiety) {
        this.satiety = Math.min(satiety, maxSatiety);
    }

    public void setEnergy(int energy) {
        this.energy = Math.min(energy, maxEnergy);
    }

    public void setHealth(int health) {
        this.health = Math.min(health, maxHealth);
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}