package _05_State.solution;

public class Shipping implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("배송 중에는 주문을 취소할 수 없습니다.");
    }

    @Override
    public void proceedToNextStep(Order order) {
        System.out.println("배송 완료 단계로 넘어갑니다.");
        order.setOrderState(new Delivered());
    }
}
