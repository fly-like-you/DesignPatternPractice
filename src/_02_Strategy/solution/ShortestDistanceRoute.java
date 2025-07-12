package _02_Strategy.solution;

public class ShortestDistanceRoute implements RouteStrategy {
    @Override
    public void findRoute(String destination) {
        System.out.println(destination + "까지 짧은 경로 추천을 합니다.");
    }
}
