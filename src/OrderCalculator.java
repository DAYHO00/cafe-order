public class OrderCalculator {
    public static int calculate(int price, int quantity) {

        if (quantity <= 0) {
            return 0;
        }

        int totalPrice = price * quantity;

        return totalPrice;
    
    }
}
