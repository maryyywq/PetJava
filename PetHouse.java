public class PetHouse {
    private String houseName;
    private String address;
    private int comfortLevel;

    // Constant for maximum comfort level
    public static final int MAX_COMFORT = 100;

    // Default constructor
    public PetHouse() {
        this.houseName = "";
        this.address = "";
        this.comfortLevel = 0;
    }

    // Parameterized constructor
    public PetHouse(String houseName, String address, int comfortLevel) {
        this.houseName = houseName;
        this.address = address;
        this.comfortLevel = Math.min(comfortLevel, MAX_COMFORT); // Ensure comfort level doesn't exceed max
    }

    // Getters
    public String getHouseName() {
        return houseName;
    }

    public String getAddress() {
        return address;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    // Setters
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = Math.min(comfortLevel, MAX_COMFORT); // Ensure comfort level doesn't exceed max
    }
}
