public class Status {
    private int satiety;
    private int energy;
    private int health;
    private Mood mood;

    // Constants for maximum values
    public static final int MAX_ENERGY = 100;
    public static final int MAX_HEALTH = 100;
    public static final int MAX_SATIETY = 100;

    // Default constructor
    public Status() {
        this.satiety = MAX_SATIETY;
        this.energy = MAX_ENERGY / 2;
        this.health = MAX_HEALTH;
        this.mood = Mood.HAPPY; // Assuming Mood is an enum
    }

    // Getters
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

    // Setters
    public void setSatiety(int satiety) {
        this.satiety = Math.min(satiety, MAX_SATIETY); // Ensure satiety does not exceed max
    }

    public void setEnergy(int energy) {
        this.energy = Math.min(energy, MAX_ENERGY); // Ensure energy does not exceed max
    }

    public void setHealth(int health) {
        this.health = Math.min(health, MAX_HEALTH); // Ensure health does not exceed max
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }
}
