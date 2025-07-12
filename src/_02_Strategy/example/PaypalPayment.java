package _02_Strategy.example;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("페이팔로 결제를 진행합니다.");
    }
}
