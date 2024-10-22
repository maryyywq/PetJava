public class Game {
    private String gameName = "";
    private String description = "Ничего не делали!";
    private int funValue;
    private int energyCost;


    public Game() { }

    public Game(String gameName, int funValue, int energyCost, String description) {
        this.gameName = gameName;
        this.funValue = funValue;
        this.energyCost = energyCost;
        this.description = description;
    }


    public String getGameName() {
        return gameName;
    }

    public int getFunValue() {
        return funValue;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public String getDescription() { return description; }




    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setFunValue(int funValue) {
        this.funValue = funValue;
    }

    public void setEnergyCost(int energyCost) {
        this.energyCost = energyCost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
