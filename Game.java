public class Game {
    private String gameName;
    private int funValue;
    private int energyCost;

    // Default constructor
    public Game() {
        this.gameName = "";
        this.funValue = 0;
        this.energyCost = 0;
    }

    // Parameterized constructor
    public Game(String gameName, int funValue, int energyCost) {
        this.gameName = gameName;
        this.funValue = funValue;
        this.energyCost = energyCost;
    }

    // Getters
    public String getGameName() {
        return gameName;
    }

    public int getFunValue() {
        return funValue;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    // Setters
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setFunValue(int funValue) {
        this.funValue = funValue;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }
}
