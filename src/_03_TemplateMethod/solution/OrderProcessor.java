package _03_TemplateMethod.solution;

public abstract class OrderProcessor {
    public final void processOrder() {
        validateOrder();
        updateInventory();
        processPayment(); // 결제 수단에 따라 다르게 처리
        updateOrderStatus();
        generateReceipt(); // 특정 결제 수단에 대해서 추가적인 정보 포함
    }

    protected void validateOrder() {
        System.out.println("주문 유효성을 체크합니다.");
    }

    protected void updateInventory() {
        System.out.println("재고를 업데이트합니다.");
    }

    protected void updateOrderStatus() {
        System.out.println("주문 상태를 변경합니다.");
    }

    protected abstract void processPayment();

    protected final void generateReceipt() {
        System.out.println("--- 영수증 ---");
        System.out.println("주문 처리 완료.");
        // 공통적인 영수증 정보 출력 (예: 주문 번호 등)

        // 훅 메소드를 호출하여 하위 클래스가 선택적으로 추가 정보 출력
        printExtraReceiptDetails();

        System.out.println("--------------");
    }

    protected void printExtraReceiptDetails() {

    }

}
