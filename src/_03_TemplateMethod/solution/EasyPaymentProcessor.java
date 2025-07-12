package _03_TemplateMethod.solution;

public class EasyPaymentProcessor extends OrderProcessor {

    private String owner;

    public EasyPaymentProcessor(String owner) {
        this.owner = owner;
    }

    @Override
    protected void processPayment() {
        System.out.println("간편 결제");
        System.out.println(owner);
    }

}
