public enum Color {
    BLACK("Черный", "Черная"),
    WHITE("Белый","Белая"),
    RED("Рыжий", "Рыжая"),
    MULTI("Разноцветный", "Разноцветная");

    private final String maleName;
    private final String femaleName;

    Color(String maleName, String femaleName) {
        this.maleName = maleName;
        this.femaleName = femaleName;
    }

    public String getFemaleName() {
        return femaleName;
    }

    public String getMaleName() {
        return maleName;
    }
}