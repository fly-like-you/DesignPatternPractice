package _05_State.solution;

public interface OrderState {
    void cancelOrder(Order order);
    void proceedToNextStep(Order order);

}
