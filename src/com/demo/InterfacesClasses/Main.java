package src.com.demo.InterfacesClasses;

public class Main {
    public static void main(String[] args) {

        // Interfaces should not be used in performance critical
        //codes because it happens at runtime

        //what we access depends on left side

//        Car car = new Car();
//        car.start();
//        car.acc();
//        car.stop();

//        Media carMedia = new Car();

        // What methods can be accessed is dependent on left side data type
        // Right side has all the methods available

//        carMedia.start();
//        carMedia.stop();

        ElectricEngine electricEngine = new ElectricEngine();
        NiceCar niceCar = new NiceCar(electricEngine);

        niceCar.start();
        niceCar.mediaStart();
        niceCar.mediaStop();
        niceCar.acc();
        niceCar.stop();

    }
}
