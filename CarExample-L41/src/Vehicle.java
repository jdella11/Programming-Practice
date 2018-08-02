import java.util.Scanner;

public class Vehicle {

    private String make;
    private double currentSpeed;
    private int currentDirection;
    private double changeSpeed=0;
    private int changeDirection=0;
    private double changeTime=0;
    /*
    Direction is based on the orientation of the steering wheel.
    For simplicity the direction will be an int.
    */

    Scanner input = new Scanner(System.in);

    public Vehicle(String make, double currentSpeed, int currentDirection) {
        this.make = make;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }

    // Initialize driving sequence
    public void promptDrive(){
        System.out.println("Let's Drive!"+'\n');
        System.out.println("You may increase your speed.");
        System.out.println("You may also change direction by turning steering wheel (steering wheel is calculated by assigning a clock face of 0-11 over the steering wheel"+'\n');
        currentDrive();
        System.out.println("Would you like to drive? (Enter 1 for yes, 0 for no) ");
        int wantDrive=input.nextInt();
        while (wantDrive!=0) {
            beginDrive();
            updateSpeed();
            updateDirection();
            currentDrive();

            System.out.println("Would you like to drive? (Enter '1' for yes, '0' for no) ");
            wantDrive=input.nextInt();
        }
    }

    //Display current speed and direction
    public void currentDrive(){
        System.out.println("Current speed: "+this.currentSpeed);
        System.out.println("Current direction: "+this.currentDirection+'\n');
    }

    // Prompt user to drive by changeSpeed, changeDirection
    public void beginDrive(){
        System.out.println("Change your speed to: ");
        changeSpeed=input.nextInt();
        System.out.println("Change Direction: ");
        changeDirection=input.nextInt();
    }

    //Update speed based on
    public void updateSpeed(){
        //implementation of switch statement for each vehicle type is possible here (ie. Car, Truck, SUV, ect...)
        Car testCar;
        testCar = new Car("Sedan");

        /*
            default the change in time to 5 seconds or 0.0014 hours
            updateSpeed = currentSpeed + accelerationCar*(0.0014)
         */

        if (currentSpeed < changeSpeed){
            this.changeTime=(changeSpeed-currentSpeed)/(testCar.accelerationCar());
            System.out.println("It took you "+(Math.round(changeTime*60*60))+" seconds to accelerate to...");
        } else {
            this.changeTime=(changeSpeed-currentSpeed)/(testCar.decelerationCar());
            System.out.println("It too you "+(Math.round(changeTime*60*60))+" seconds to decelerate to...");
        }
        this.currentSpeed=changeSpeed;
    }

    //Update the current direction
    public void updateDirection(){
        currentDirection=currentDirection+changeDirection;
    }


    public String getMake() {
        return make;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public double getChangeSpeed() {
        return changeSpeed;
    }

    public int getChangeDirection() {
        return changeDirection;
    }
}
