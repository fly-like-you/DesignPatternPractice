package _01_Facade.solution;

// 서브 시스템: 신혼여행 예약
class HoneymoonPackage {
    public void bookPackage(String destination, int nights) {
        System.out.println(destination + " " + nights + "박 신혼여행 패키지 예약 완료.");
    }
}