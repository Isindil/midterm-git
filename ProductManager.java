package ProductManager;

public class ProductManager {
     public static void main(String[] args) {
        System.out.println("Hello, Product Manager!");
    }

    public static double calculateDiscount(double price, double percent) {
        return price - (price * (percent / 100));
    }
}
