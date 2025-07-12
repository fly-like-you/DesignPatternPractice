package _02_Strategy.example;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("1234-1234-1234-1234", "박준호"));
        cart.checkout(10000);

        cart = new ShoppingCart(new PaypalPayment());
        cart.checkout(10000);
    }
}
