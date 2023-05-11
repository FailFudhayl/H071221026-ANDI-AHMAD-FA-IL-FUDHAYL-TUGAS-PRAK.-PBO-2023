package NO3;

import java.util.List;

public class Restaurant {
    static int calculateTotal(List<Food> mkn) {
        int totalPrice = 0;
        for (Food item : mkn) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
