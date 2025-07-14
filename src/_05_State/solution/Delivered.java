package _05_State.solution;

public class Delivered implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("배송 완료된 주문은 취소할 수 없습니다.");
    }

    @Override
    public void proceedToNextStep(Order order) {
        System.out.println("주문 상태를 변경할 수 없습니다.");
    }
}
