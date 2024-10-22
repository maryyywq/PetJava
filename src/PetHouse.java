public class PetHouse {
    private String houseName;
    private String address;
    private int comfortLevel;


    public static final int maxComfort = 100;

    public PetHouse() {
        this.houseName = "";
        this.address = "";
        this.comfortLevel = 0;
    }


    public PetHouse(String houseName, String address, int comfortLevel) {
        this.houseName = houseName;
        this.address = address;
        this.comfortLevel = Math.min(comfortLevel, maxComfort);
    }


    public String getHouseName() {
        return houseName;
    }

    public String getAddress() {
        return address;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }


    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setComfortLevel(int comfortLevel) {
        this.comfortLevel = Math.min(comfortLevel, maxComfort);
    }
}
