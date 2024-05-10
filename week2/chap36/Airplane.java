package week2.chap36;

public class Airplane implements Flyable{

    //속성
    private String airPlaneID;
    private long remainingFuelAmount;
    private long maximumCapacity;

    @Override // 구현 무조건 해주어야함.
    public void fly() { 
        System.out.println("비행기 ID(" + airPlaneID + ")가 이륙합니다");
    }
    
    void refillFuel(long fuel){
        remainingFuelAmount += fuel;
    }

    public Airplane(String airPlaneID) {
        this.airPlaneID = airPlaneID;
    }
    
}
