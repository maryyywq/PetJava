public abstract class PetItem {
    protected String name;
    protected int value;
    protected int cost;

    // Default constructor
    public PetItem() {
        this.name = "";
        this.value = 0;
        this.cost = 0;
    }

    // Parameterized constructor
    public PetItem(String name, int value, int cost) {
        this.name = name;
        this.value = value;
        this.cost = cost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getCost() {
        return cost;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // Abstract method
    public abstract String getType();
}
