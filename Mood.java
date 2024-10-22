public enum Mood {
    HAPPY,
    ANGRY,
    SAD,
    AFRAID;

    private final String name;

    StatusType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}