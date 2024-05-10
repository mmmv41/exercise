package week2.chap36;

public class InterfaceTest2 {
    public static void main(String[] args) {
        
        //Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB002");

        drone.fly();
        airplane.fly();

        if (drone instanceof Drone){ // Drone으로 인스턴스화 되는지 
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
