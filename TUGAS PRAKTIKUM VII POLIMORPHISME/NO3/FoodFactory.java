package NO3;

public class FoodFactory {
    static Food getFood(String food) {
        Food makanan = null;
        if (food.equals("burger")) {
            makanan = new Burger();
        } else if (food.equals("pizza")) {
            makanan = new Pizza();
        } else if (food.equals("steak")) {
            makanan = new Steak();
        }

        return makanan;
    }
}
