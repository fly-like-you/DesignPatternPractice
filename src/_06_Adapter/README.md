훌륭합니다\! 어댑터 패턴에 대한 문제를 내드리겠습니다. USB 관련 예시는 제외하고 실생활과 관련된 시나리오로 준비했습니다.

-----

## 어댑터 패턴 문제: 구형 내비게이션과 신형 지도 데이터

당신은 자동차 내비게이션 시스템을 개발하는 회사에 다니고 있습니다. 현재 회사에서 판매하는 **구형 내비게이션 시스템**은 \*\*`LegacyNavigator`\*\*라는 클래스로 구현되어 있으며, 이 클래스는 지도를 표시하기 위해 **`displayRoute(List<String> oldFormatRoute)`** 메서드를 사용합니다. 이 메서드는 경로 정보를 문자열 리스트(`List<String>`) 형태로 받습니다.

하지만 최근에 **새로운 지도 데이터 제공 업체**와 계약을 맺었습니다. 이 업체가 제공하는 지도 데이터는 \*\*`NewMapData`\*\*라는 클래스로 제공되며, 경로 정보는 **`getOptimizedPath()`** 메서드를 통해 **`Path`** 객체 형태로 반환됩니다. `Path` 객체는 내부적으로 좌표 정보 등을 담고 있어 구형 내비게이션 시스템의 `List<String>`과는 호환되지 않습니다.

-----

### **문제:**

당신은 기존의 `LegacyNavigator` 클래스를 수정하지 않고, 새로운 `NewMapData`의 경로 정보를 `LegacyNavigator`에서 사용할 수 있도록 **어댑터 패턴**을 적용해야 합니다.

아래 주어진 코드 구조를 참고하여, `LegacyNavigator`가 `NewMapData`를 사용할 수 있도록 어댑터 클래스를 구현하고, 이를 활용하여 경로를 표시하는 시나리오를 완성해보세요.

-----

### **주어진 코드 (Java):**

```java
import java.util.ArrayList;
import java.util.List;

// 신형 지도 데이터 클래스 (수정 불가)
class NewMapData {
    public Path getOptimizedPath() {
        System.out.println("새로운 지도 데이터에서 최적화된 경로를 가져옵니다.");
        return new Path("위도1,경도1;위도2,경도2;위도3,경도3"); // 예시 Path 객체
    }
}

// Path 객체 (수정 불가)
class Path {
    private String coordinates;

    public Path(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getCoordinates() {
        return coordinates;
    }
}

// 구형 내비게이션 시스템 (수정 불가)
class LegacyNavigator {
    public void displayRoute(List<String> oldFormatRoute) {
        System.out.println("--- 구형 내비게이션 경로 표시 ---");
        for (String step : oldFormatRoute) {
            System.out.println(step);
        }
        System.out.println("---------------------------");
    }
}

// 클라이언트 코드 (이 부분에서 어댑터를 활용하여 LegacyNavigator와 NewMapData를 연결해야 합니다.)
public class NavigatorClient {
    public static void main(String[] args) {
        // 여기에 어댑터 패턴을 적용하여 LegacyNavigator와 NewMapData를 연결하는 코드를 작성하세요.

        // 예시: LegacyNavigator가 NewMapData의 경로를 표시하도록
        // LegacyNavigator legacyNav = new LegacyNavigator();
        // NewMapData newMap = new NewMapData();
        // ... 어댑터를 사용하여 newMap의 경로를 legacyNav에 전달
    }
}
```

-----

이 문제를 통해 어댑터 패턴의 핵심인 **기존 인터페이스를 새로운 인터페이스에 맞게 변환하는 방법**을 이해하실 수 있을 것입니다. 도전해보세요\!