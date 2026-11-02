public class OrderCalculator {
    public static int calculate(int price, int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1개 이상이어야 합니다.");
        }

        int totalPrice = price * quantity;

        return totalPrice;
    }
}