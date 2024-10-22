public class GameDay {
    private int dayNumber;
    private Weather weather;

    // Default constructor
    public GameDay() {
        this.dayNumber = 0;
        this.weather = Weather.SUNNY; // Assuming SUNNY is a value in Weather enum
    }

    // Parameterized constructor
    public GameDay(int dayNumber, Weather weather) {
        this.dayNumber = dayNumber;
        this.weather = weather;
    }

    // Getters
    public int getDayNumber() {
        return dayNumber;
    }

    public Weather getWeather() {
        return weather;
    }

    // Setters
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
