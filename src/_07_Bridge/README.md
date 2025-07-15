브릿지 패턴은 **추상화(Abstraction)와 구현(Implementation)을 분리하여 각각 독립적으로 변화하고 확장할 수 있도록 하는 구조 디자인 패턴**입니다. 쉽게 말해, 어떤 기능을 제공하는 방식(추상화)과 그 기능을 실제로 어떻게 처리하는지(구현)를 별개의 계층으로 나누는 거죠. 이렇게 하면 추상화 계층의 변경이 구현 계층에 영향을 주지 않고, 반대로 구현 계층의 변경도 추상화 계층에 영향을 주지 않아 유연성과 확장성이 크게 향상됩니다.

-----

## 브릿지 패턴 문제: 차량 및 구동 방식

당신은 자동차 제조 회사에서 소프트웨어 개발을 담당하고 있습니다. 이 회사에서는 다양한 종류의 차량(예: 세단, SUV, 트럭)을 생산하고, 각 차량은 다양한 구동 방식(예: 전기 모터, 가솔린 엔진, 하이브리드 엔진)으로 작동할 수 있습니다.

회사는 신차 개발 및 기존 차량의 개선 작업을 자주 진행하며, 이때 차량의 종류가 추가되거나 구동 방식이 추가 또는 변경될 수 있습니다. 현재 구조에서는 새로운 차량 종류가 추가될 때마다 각 구동 방식에 대한 구현을 일일이 추가해야 하고, 새로운 구동 방식이 추가될 때마다 모든 차량 종류에 대해 수정이 필요하여 유지보수가 어렵습니다.

**요구사항:**

1.  **차량의 종류**와 **구동 방식**을 독립적으로 확장할 수 있도록 설계해야 합니다.
2.  새로운 차량 종류(예: 밴)가 추가되거나 새로운 구동 방식(예: 수소 엔진)이 추가되어도 기존 코드를 최소한으로 변경하도록 설계해야 합니다.
3.  각 차량은 `start()`, `accelerate()`, `brake()`와 같은 기본적인 동작을 수행할 수 있어야 합니다.

**제공된 뼈대 코드:**

```java
// 구동 방식 (Implementation) 인터페이스
interface Engine {
    void startEngine();
    void accelerateEngine();
    void stopEngine();
}

// 구체적인 구동 방식 구현체
class ElectricEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("전기 모터 시동!");
    }

    @Override
    public void accelerateEngine() {
        System.out.println("전기 모터 가속!");
    }

    @Override
    public void stopEngine() {
        System.out.println("전기 모터 정지!");
    }
}

class GasolineEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("가솔린 엔진 시동!");
    }

    @Override
    public void accelerateEngine() {
        System.out.println("가솔린 엔진 가속!");
    }

    @Override
    public void stopEngine() {
        System.out.println("가솔린 엔진 정지!");
    }
}

// TODO: 차량 (Abstraction) 추상 클래스와 구체적인 차량 클래스를 브릿지 패턴에 맞게 완성하세요.
// 힌트: 차량 추상 클래스는 Engine 인터페이스를 필드로 가집니다.

// 차량 (Abstraction) 추상 클래스
abstract class Vehicle {
    protected Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void start();
    public abstract void accelerate();
    public abstract void brake();
}

// 구체적인 차량 클래스 (예: Sedan, SUV)
class Sedan extends Vehicle {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        System.out.print("세단: ");
        engine.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.print("세단: ");
        engine.accelerateEngine();
    }

    @Override
    public void brake() {
        System.out.print("세단: ");
        engine.stopEngine();
    }
}

class SUV extends Vehicle {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void start() {
        System.out.print("SUV: ");
        engine.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.print("SUV: ");
        engine.accelerateEngine();
    }

    @Override
    public void brake() {
        System.out.print("SUV: ");
        engine.stopEngine();
    }
}

public class BridgePatternProblem {
    public static void main(String[] args) {
        // TODO: 브릿지 패턴을 활용하여 다양한 차량과 구동 방식을 조합하여 동작을 확인하세요.
        // 예시: 전기 세단, 가솔린 SUV 등
    }
}
```

-----

**문제 해결을 위한 가이드라인:**

* `Engine` 인터페이스와 그 구현체들은 \*\*구현 계층(Implementation Hierarchy)\*\*을 이룹니다.
* `Vehicle` 추상 클래스와 그 하위 클래스들은 \*\*추상화 계층(Abstraction Hierarchy)\*\*을 이룹니다.
* `Vehicle` 추상 클래스는 `Engine` 인터페이스 타입의 객체를 \*\*컴포지션(Composition)\*\*으로 가집니다. 이 부분이 브릿지 패턴의 핵심 "다리" 역할을 합니다.
* 클라이언트 코드(`main` 메서드)에서 `Vehicle`의 구체적인 구현체들을 생성할 때, 생성자를 통해 원하는 `Engine` 구현체를 주입하여 사용할 수 있도록 합니다.
