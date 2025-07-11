package _01_Facade.solution;

// Facade 클래스 (여기를 완성하세요!)
class WeddingPlannerFacade {
    private HoneymoonPackage honeymoonPackage;
    private StudioDressMakeup studioDressMakeup;
    private WeddingHall weddingHall;

    public WeddingPlannerFacade(HoneymoonPackage honeymoonPackage, StudioDressMakeup studioDressMakeup, WeddingHall weddingHall) {
        this.honeymoonPackage = honeymoonPackage;
        this.studioDressMakeup = studioDressMakeup;
        this.weddingHall = weddingHall;
    }

    public void planWedding(String destination, int nights, String concept, String date, String location) {
        honeymoonPackage.bookPackage(destination, nights);
        studioDressMakeup.contractSDM(concept);
        weddingHall.bookHall(date, location);
    }
}