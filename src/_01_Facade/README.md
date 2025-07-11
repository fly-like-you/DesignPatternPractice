### Facade 패턴 문제 (실생활 예시)

당신은 이제 막 결혼식을 올리려는 예비 부부입니다. 결혼식을 준비하려면 여러 복잡한 절차를 거쳐야 합니다. 예를 들어, **웨딩홀 예약, 스드메(스튜디오, 드레스, 메이크업) 계약, 신혼여행 패키지 예약** 등이 있습니다. 이 모든 과정을 직접 처리하려면 너무 복잡하고 여러 업체와 소통해야 해서 지칠 수 있습니다.

**문제:** Facade 패턴을 사용하여 예비 부부가 결혼식 준비를 **간편하게** 할 수 있도록 돕는 시스템을 설계해보세요.

**힌트:**

* 각각의 복잡한 절차(웨딩홀 예약, 스드메 계약, 신혼여행 예약)를 담당하는 클래스들이 있다고 가정해봅시다.
* 예비 부부는 이 모든 복잡한 절차를 **하나의 간단한 인터페이스**를 통해 처리하고 싶어 합니다.

아래 코드 스켈레톤을 참고하여 `WeddingPlannerFacade` 클래스를 완성하고, `main` 메소드에서 이를 사용하는 예시를 보여주세요.

```java
// 서브 시스템: 웨딩홀 예약
class WeddingHall {
    public void bookHall(String date, String location) {
        System.out.println("웨딩홀 " + location + " " + date + " 예약 완료.");
    }
}

// 서브 시스템: 스드메 계약
class StudioDressMakeup {
    public void contractSDM(String concept) {
        System.out.println(concept + " 컨셉의 스드메 계약 완료.");
    }
}

// 서브 시스템: 신혼여행 예약
class HoneymoonPackage {
    public void bookPackage(String destination, int nights) {
        System.out.println(destination + " " + nights + "박 신혼여행 패키지 예약 완료.");
    }
}

// Facade 클래스 (여기를 완성하세요!)
class WeddingPlannerFacade {
    private WeddingHall weddingHall;
    private StudioDressMakeup sdm;
    private HoneymoonPackage honeymoon;

    public WeddingPlannerFacade() {
        this.weddingHall = new WeddingHall();
        this.sdm = new StudioDressMakeup();
        this.honeymoon = new HoneymoonPackage();
    }

    public void planWedding(String hallDate, String hallLocation, String sdmConcept, String honeymoonDestination, int honeymoonNights) {
        // 여기에 Facade 로직을 작성하세요.
    }
}

public class FacadeProblem {
    public static void main(String[] args) {
        // Facade를 사용하여 결혼식 준비를 간편하게 처리하는 코드를 작성하세요.
    }
}
```
