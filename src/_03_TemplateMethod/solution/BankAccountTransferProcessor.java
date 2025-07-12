package _03_TemplateMethod.solution;

public class BankAccountTransferProcessor extends OrderProcessor {

    private String owner;
    private String accountNumber;

    public BankAccountTransferProcessor(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    @Override
    protected void processPayment() {
        System.out.println("계좌 결제");
        System.out.println(owner);
        System.out.println(accountNumber);
    }

}
