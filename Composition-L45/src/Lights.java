public class Lights {
    private int numLights;
    private String typeLights;

    public Lights(int numLights, String typeLights) {
        this.numLights = numLights;
        this.typeLights = typeLights;
    }

    public void displayLights(){
        System.out.println("There are a total of "+numLights+" of "+typeLights+" lights.");
    }

    public int getNumLights() {
        return numLights;
    }

    public String getTypeLights() {
        return typeLights;
    }
}

