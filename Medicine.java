public class Medicine extends PetItem {

    // Default constructor
    public Medicine() {
        super();
    }

    // Parameterized constructor
    public Medicine(String name, int value, int cost) {
        super(name, value, cost);
    }

    // Overriding getType method
    @Override
    public String getType() {
        return "Medicine";
    }
}

