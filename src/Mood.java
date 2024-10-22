public enum Mood {
    HAPPY("Счастливый"),
    ANGRY("Злой"),
    SAD("Грустный"),
    AFRAID("Испуганный");

    private final String name;

    Mood(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}