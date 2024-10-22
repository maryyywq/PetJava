public class Owner {
    private String ownerName;
    private int ownerAge;
    private int money;

    // Default constructor
    public Owner() {
        this.ownerName = "";
        this.ownerAge = 0;
        this.money = 0;
    }

    // Parameterized constructor
    public Owner(String ownerName, int ownerAge, int money) {
        this.ownerName = ownerName;
        this.ownerAge = ownerAge;
        this.money = money;
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public int getMoney() {
        return money;
    }

    // Setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

