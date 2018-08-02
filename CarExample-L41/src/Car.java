public class Car extends Vehicle {
    private String body;    //must be = "Sedan", "Coupe" or "Hatchback"

    public Car(String body) {
        super("Car","Car",4,"Gas",4,0,0);
        this.body = body;
    }

    /*
        The Car class defines the acceleration, and deceleration of a vehicle.car()
     */

    public double accelerationCar() {
        return 3571;
    }

    public double decelerationCar(){
        return -5000;
    }
}
