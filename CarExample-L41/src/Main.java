public class Main {
    public static void main(String[] args){
        /*
            Programmer input of a travelling car with the ability to speed up, change direction, or stop.
         */

        Vehicle sedan;   //create sedan instance using base Vehicle class
        sedan = new Vehicle("Audi", 60,4);
        sedan.promptDrive();
    }
}
