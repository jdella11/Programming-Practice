public class Main {
    public static void main (String[] args){
        Animal myanimal = new Animal("Giraffe", 1,10,2000,"Animilia");

        Giraffe myGiraffe = new Giraffe("Giraffe", 8,20,2,"Animals","Norther",4,100);
        //myGiraffe.eat();
        myGiraffe.movement(25);

    }
}
