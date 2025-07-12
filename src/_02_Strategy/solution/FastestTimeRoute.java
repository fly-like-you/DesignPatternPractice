package _02_Strategy.solution;

public class FastestTimeRoute implements RouteStrategy{
    @Override
    public void findRoute(String destination) {
        System.out.println(destination + "까지 가장 빠른 시간대의 경로 추천을 합니다.");
    }
}
