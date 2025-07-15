package _07_Bridge.solution;

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
        SUV suvWithGasoline = new SUV(new GasolineEngine());
        suvWithGasoline.start();
        suvWithGasoline.accelerate();
        suvWithGasoline.brake();

        SUV suvWithElectric = new SUV(new ElectricEngine());
        suvWithElectric.start();
        suvWithElectric.accelerate();
        suvWithElectric.brake();
    }
}