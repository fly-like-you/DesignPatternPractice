package _02_Strategy.example;

public class CreditCardPayment implements PaymentStrategy{
    private final String cardNumber;
    private final String owner;

    public CreditCardPayment(String cardNumber, String owner) {
        this.cardNumber = cardNumber;
        this.owner = owner;
    }

    @Override
    public void pay(int amount) {
        System.out.println(owner + "님의 카드 " + cardNumber + ": 결제를 진행합니다.");
    }
}
