public class Main {
    public static void main(String[] args){
    Bedroom theBedroom = new Bedroom(new Lights(5,"Recessed"), new Furninture(10,new sizeBed(20,50,5)), new DoorandWindows(1,2));
    theBedroom.displayFurniture();
    }
}
