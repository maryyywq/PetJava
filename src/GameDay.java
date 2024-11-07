public class GameDay {
    private int dayNumber;
    private Weather weather = Weather.SUNNY;


    public GameDay() { }


    public GameDay(int dayNumber, Weather weather) {
        this.dayNumber = dayNumber;
        this.weather = weather;
    }


    public int getDayNumber() {
        return dayNumber;
    }

    public Weather getWeather() {
        return weather;
    }


    public void setDayNumber(int dayNumber) {
        if (dayNumber < 0) {
            throw new IllegalArgumentException("Номер дня не может быть отрицательным!");
        }
        this.dayNumber = dayNumber;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
