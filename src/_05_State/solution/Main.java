package _05_State.solution;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(); // 주문 객체 생성 (초기 상태: OrderPlaced)

        // 상태 전이 테스트
        order.proceedToNextStep(); // OrderPlaced -> Processing
        order.proceedToNextStep(); // Processing -> Shipping
        order.proceedToNextStep(); // Shipping -> Delivered
        order.proceedToNextStep(); // Delivered (상태 변경 없음)
        order.proceedToNextStep(); // Delivered (상태 변경 없음)

        System.out.println("\n취소 로직 테스트:");
        Order newOrder = new Order(); // 새로운 주문 생성 (OrderPlaced)
        newOrder.cancelOrder(); // OrderPlaced -> OrderCanceled
        newOrder.proceedToNextStep(); // OrderCanceled (상태 변경 없음)
        newOrder.cancelOrder(); // OrderCanceled (상태 변경 없음)
    }
}
