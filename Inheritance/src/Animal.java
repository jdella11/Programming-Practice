public class Animal {
    private String name;
    private int body;
    private int size;
    private int weight;
    private String kingdom;

    public void eat(){
        System.out.println("eat called");
    }

    public void movement(int speed){
        System.out.println("speed called: "+speed);
    }

    public Animal(String name, int body, int size, int weight, String kingdom) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.kingdom = kingdom;
    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getKingdom() {
        return kingdom;
    }
}
