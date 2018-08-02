/*
    We are going to go back to the car analogy.
    Create a base class called Car
    It should have a few fields that would be appropriate for a generice car calss.
    engine, cylinders, wheels, etc.

    Constructor should initialize cylinders (number of) and name, and set wheels to 4
    and engine to true. Cylinders and names would be passed parameters.
    Create appropriate getters
    Create some methods like startEngine, accelerate, and brake
    show a message for each in the base class

    Now create 3 sub classes for your favorite vehicles.
    Override the appropriate methods to demonstrate polymorphism in use.
    put all classes in the one java file (this one).
*/

public class main {
    public static void main(String[] args){
        Car newCar = new Audi();
        newCar.display();

        Car honda = new Honda();
        honda.display();
    }
}

class Car {
    private String name;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
    }

    //Display all car information
    public void display(){
        System.out.println("Car: "+name+'\n'+"Cylinders: "+cylinders);
        System.out.println(engineState());
        System.out.println(acceleration());
        System.out.println(stoppingPower());

    }

    //Engine State (off by default)
    public String engineState(){
        return "Car is off.";
    }

    //Acceleration
    public String acceleration(){
        return "No information on acceleration.";
    }

    //Stopping Power
    public String stoppingPower(){
        return "No information on stopping power.";
    }
}

class Audi extends Car {
    public Audi(){
        super("Audi",6);
    }

    @Override
    public String engineState() {
        return "Car has turned on.";
    }

    @Override
    public String acceleration() {
        return "Acceleration: 5 m/s^2";
    }

    @Override
    public String stoppingPower() {
        return "Stoppping power: 10 m/s^2";
    }
}

class Honda extends Car {
    public Honda(){
        super("Honda",4);
    }

    @Override
    public String engineState() {
        return "Car has turned on";
    }

    @Override
    public String acceleration() {
        return "Acceleration: 2 m/s^2";
    }
}
