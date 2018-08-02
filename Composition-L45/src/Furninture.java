public class Furninture {
    private int numFurniture;
    private sizeBed theSizeBed;

    public Furninture(int numFurniture, sizeBed theSizeBed) {
        this.numFurniture = numFurniture;
        this.theSizeBed = theSizeBed;
    }

    public void displayFurniture(){
        System.out.println("There are a total of "+numFurniture+" pieces of furniture in the bedroom.");
    }

    public void callBed(){
        theSizeBed.displaySizeBed();
    }
    private int getNumFurniture() {
        return numFurniture;
    }

    private sizeBed getTheSizeBed() {
        return theSizeBed;
    }
}
