package _03_TemplateMethod.solution;

public class CreditCardPaymentProcessor extends OrderProcessor {

    private String creditCardNumber;
    private String owner;

    public CreditCardPaymentProcessor(String creditCardNumber, String owner) {
        this.creditCardNumber = creditCardNumber;
        this.owner = owner;
    }

    @Override
    protected void processPayment() {
        System.out.println("신용카드 결제");
        System.out.println(creditCardNumber);
        System.out.println(owner);
    }

    @Override
    protected void printExtraReceiptDetails() {
        System.out.println("승인 번호 123123123");
    }
}
