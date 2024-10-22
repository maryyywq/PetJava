// Класс еды
public class Food extends PetItem {

    public Food() {
        super();
    }

    public Food(String foodName, int nutritionValue, int cost) {
        super(foodName, nutritionValue, cost);
    }

    @Override
    public String getType() {
        return "Food";
    }
}

