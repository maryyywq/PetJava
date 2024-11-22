public class PetFabric {
    public static Pet createPet(PetType type, String name, Sex sex) {
        return switch (type) {
            case DOG -> new Dog(name, 0, sex, Color.getRandomColor());
            case CAT -> new Cat(name, 0, sex, Color.getRandomColor());
            case HAMSTER -> new Hamster(name, 0, sex, Color.getRandomColor());
            default -> throw new IllegalArgumentException("Невозможно создать такое животное: " + type);
        };
    }
}

