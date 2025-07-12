package _02_Strategy.solution;

public class Main {
    public static void main(String[] args) {
        String destination = "서울";
        NavigationApp app = new NavigationApp(new FastestTimeRoute());
        app.navigate(destination);

        app = new NavigationApp(new ScenicRoute());
        app.navigate(destination);

        app = new NavigationApp(new ShortestDistanceRoute());
        app.navigate(destination);
    }
}
