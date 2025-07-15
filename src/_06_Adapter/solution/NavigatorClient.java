package _06_Adapter.solution;

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

class NavigatorAdaptor {
    private Path path;
    private LegacyNavigator legacyNavigator;

    public NavigatorAdaptor(Path path, LegacyNavigator legacyNavigator) {
        this.path = path;
        this.legacyNavigator = legacyNavigator;
    }

    public void displayRoute() {
        List<String> paths = List.of(path.getCoordinates().split(";"));
        legacyNavigator.displayRoute(paths);

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
        LegacyNavigator legacyNav = new LegacyNavigator();
        NewMapData newMap = new NewMapData();

        NavigatorAdaptor navigatorAdaptor = new NavigatorAdaptor(newMap.getOptimizedPath(), legacyNav);
        navigatorAdaptor.displayRoute();
    }
}