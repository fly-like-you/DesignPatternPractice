package _02_Strategy.solution;

public class ScenicRoute implements RouteStrategy {
    @Override
    public void findRoute(String destination) {
        System.out.println(destination + "까지 경치가 좋은 경로로 추천을 합니다.");
    }
}
