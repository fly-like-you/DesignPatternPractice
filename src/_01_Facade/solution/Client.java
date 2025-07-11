package _01_Facade.solution;

public class Client {
    public static void main(String[] args) {
        HoneymoonPackage honeymoonPackage = new HoneymoonPackage();
        StudioDressMakeup studioDressMakeup = new StudioDressMakeup();
        WeddingHall weddingHall = new WeddingHall();

        WeddingPlannerFacade weddingPlannerFacade = new WeddingPlannerFacade(honeymoonPackage, studioDressMakeup, weddingHall);
        weddingPlannerFacade.planWedding("양양", 10, "예쁘게", "10월10일", "광안리");

    }
}
