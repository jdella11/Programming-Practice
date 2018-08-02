public class Giraffe extends Animal{
    private String subSpecies;
    private int legs;
    private int neckLength;

    public Giraffe(String name, int body, int size, int weight, String kingdom, String subSpecies, int legs, int neckLength) {
        super(name, body, size, weight, kingdom);
        this.subSpecies = subSpecies;
        this.legs = legs;
        this.neckLength = neckLength;
    }

    private void chew(){
        System.out.println("chew called");
    }

    @Override
    public void eat() {
        System.out.println("eat called");
        chew();
        super.eat();
    }



    private int moveLegs(){
        System.out.println("moveLegs called");
        return 123;
    }

    private int moveHead(){
        System.out.println("moveHead called");
        return 456;
    }

    @Override
    public void movement(int speed) {
        System.out.println("movement 1: "+speed);
        if (speed < 50){
            System.out.println("movement moveHead: "+moveHead());
            System.out.println("movement moveLegs: "+moveLegs());
            speed+=(moveHead()+moveLegs());
            System.out.println("current speed: "+speed);
        }

        super.movement(speed);
        System.out.println("movement 2: "+speed);
    }
}
