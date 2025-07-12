package _02_Strategy.solution;

public class NavigationApp {
    private final RouteStrategy routeStrategy;

    public NavigationApp(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String destination) {
        routeStrategy.findRoute(destination);
    }
}
