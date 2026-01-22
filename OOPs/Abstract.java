abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Petrol or Diesel");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with key");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuel();
    }
}
