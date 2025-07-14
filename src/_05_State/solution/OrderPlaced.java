package _05_State.solution;

public class OrderPlaced implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("주문을 취소했습니다.");
        order.setOrderState(new OrderCanceled());
    }

    @Override
    public void proceedToNextStep(Order order) {
        System.out.println("배송 준비 단계로 넘어갑니다.");
        order.setOrderState(new Processing());
    }
}
