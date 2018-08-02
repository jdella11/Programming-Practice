public class Bedroom {
    private Lights theLights;
    private  Furninture theFurniture;
    private DoorandWindows theDoorandWindows;

    public Bedroom(Lights theLights, Furninture theFurniture, DoorandWindows theDoorandWindows) {
        this.theLights = theLights;
        this.theFurniture = theFurniture;
        this.theDoorandWindows= theDoorandWindows;
    }

    public void displayFurniture(){
        theFurniture.displayFurniture();
        theFurniture.callBed();
    }
    private Lights getTheLights() {
        return theLights;
    }

    private Furninture getTheFurniture() {
        return theFurniture;
    }

    private DoorandWindows getTheDoorandWindows() {
        return theDoorandWindows;
    }
}

