public abstract class PetItem {
    protected String name = "";
    protected int value;
    protected int cost;
    protected Class<? extends Pet> petUser = Pet.class;

    public PetItem() { }

    public PetItem(String name, int value, int cost) {
        this.name = name;
        this.value = value;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getCost() {
        return cost;
    }

    public Class getPetUser() {
        return petUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setPetUser(Class<? extends Pet> petUser) {
        this.petUser = petUser;
    }
}
