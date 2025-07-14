package _05_State.solution;

public class Processing implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("배송 준비 단계에서 배송을 취소할 수 없습니다.");
    }

    @Override
    public void proceedToNextStep(Order order) {
        System.out.println("배송 중 단계로 넘어 갑니다.");
        order.setOrderState(new Shipping());
    }
}
