package _03_TemplateMethod.solution;

public class Main {
    public static void main(String[] args) {
        CreditCardPaymentProcessor cardPaymentProcessor = new CreditCardPaymentProcessor("1111-2222-3333-4444", "준호");
        cardPaymentProcessor.processOrder();
    }
}
