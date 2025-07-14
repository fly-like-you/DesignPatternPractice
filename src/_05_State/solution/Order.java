package _05_State.solution;

public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new OrderPlaced();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void cancelOrder() {
        orderState.cancelOrder(this);
    }

    public void proceedToNextStep() {
        orderState.proceedToNextStep(this);
    }
}
