package _05_State.solution;

public class OrderCanceled implements OrderState {
    @Override
    public void cancelOrder(Order order) {
        System.out.println("이미 취소된 주문입니다.");
    }

    @Override
    public void proceedToNextStep(Order order) {
        System.out.println("취소를 취소할 수 없습니다.");
    }
}
