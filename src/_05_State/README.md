## **상태 패턴 문제: 온라인 쇼핑몰 주문 처리 시스템**

당신은 온라인 쇼핑몰의 주문 처리 시스템을 개발하고 있습니다. 이 시스템에서는 하나의 **주문(Order)**이 여러 단계를 거쳐 처리됩니다. 주문의 상태에 따라 고객에게 제공되는 정보와 다음 단계로의 전환 가능성이 달라집니다.

현재 주문은 다음과 같은 상태들을 가질 수 있습니다:

* **주문 접수됨 (OrderPlaced)**: 고객이 주문을 완료한 초기 상태입니다. 이 상태에서는 주문을 **취소**하거나 **배송 준비 중** 상태로 변경할 수 있습니다.
* **배송 준비 중 (Processing)**: 주문된 상품을 배송하기 위해 준비하는 상태입니다. 이 상태에서는 주문을 **취소**할 수 없으며, **배송 중** 상태로 변경할 수 있습니다.
* **배송 중 (Shipping)**: 상품이 고객에게 배송되고 있는 상태입니다. 이 상태에서는 주문을 **취소**할 수 없으며, **배송 완료** 상태로 변경할 수 있습니다.
* **배송 완료 (Delivered)**: 상품이 고객에게 성공적으로 전달된 상태입니다. 이 상태에서는 더 이상 주문 상태를 변경할 수 없습니다.

**요구사항:**

1.  각 주문 상태를 나타내는 클래스를 만드세요.
2.  `Order` 클래스는 현재 주문의 상태를 관리하고, 상태에 따른 행동(예: 취소, 다음 단계로 전환)을 위임하도록 설계하세요.
3.  `Order` 클래스에서 `cancelOrder()`와 `proceedToNextStep()` 메소드를 호출했을 때, 현재 주문 상태에 따라 적절한 동작을 수행하도록 구현하세요.
4.  **`if-else` 또는 `switch-case` 문 없이** 상태 변화 로직을 처리해야 합니다.

**힌트:** 상태 패턴의 핵심은 객체의 내부 상태에 따라 객체의 행동이 변할 때, 그 상태를 독립적인 객체로 분리하여 캡슐화하는 것입니다.

---

**문제 해결을 위해 어떤 부분을 먼저 생각해볼까요?**

1.  **각 주문 상태가 공통으로 가져야 할 행동은 무엇일까요?** (예: 취소, 다음 단계로 진행)
2.  **`Order` 클래스가 상태 객체와 어떻게 상호작용해야 할까요?**

이 문제를 해결해보시고, 완료되면 답을 알려주세요! 정답 확인 후 자세한 해설과 함께 더 어려운 문제도 내드릴 수 있습니다.