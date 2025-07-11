package _01_Facade.solution;

// 서브 시스템: 웨딩홀 예약
class WeddingHall {
    public void bookHall(String date, String location) {
        System.out.println("웨딩홀 " + location + " " + date + " 예약 완료.");
    }
}