// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (toppings) to
// be added to the burgers and pricing.

// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills 	store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got 	added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

// Also create two extra varieties of Hamburgers (subclasses) to cater for

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.


//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.s

import java.util.Scanner;

public class Hamburger {
    private int breadType;
    private int meatType;
    private double price;

    Scanner input = new Scanner(System.in);

    public Hamburger(int breadType, int meatType, double price) {
        this.breadType = 1;
        this.meatType = 1;
        this.price = 5.00;
    }

    //Initialize the menu, this will be one the only public methods allowed as it simply is calling our private method menu and does not allow any kind of immediate manipulation
    public void intialize(){
        System.out.println("==============================");
        System.out.println("Bill's Burger "+'"'+"Cash Register"+'"');
        System.out.println("=============================="+'\n');
        menu();
    }

    /*
    Display menu that handles selection of default burgers.  This is kept private to not allow outside functions to mishandle the menu.
    Classic burger is handled internally while all other burgers will call their individual class to handle what the burger is
    Note: notice that all prices are stored inside the template class of Hamburger and all calculations for pricing are also handled inside the template class of Hamburger
    */
    private void menu(){
        System.out.println("Choose from the following menu");
        System.out.println("(1) Classic Bill's Burger.......... 5.00");         //whiteBread, beef, ability to choose 4 toppings (0 by default, but included in price)
        System.out.println("(2) Healthy Bill's Burger.......... 8.25");         //brownBread, vegan, ability to choose 6 toppings (0 by default, but included in price)
        System.out.println("(3) Deluxe Bill's Burger........... 8.00");   //whiteBread, beef, lettuce, tomato, chips, drink (no ability to choose additional toppings)
        System.out.println("(0) Exit Menu"+'\n');
        System.out.println("What would you like to select?");
        int order = input.nextInt();

        if(order==0){
            return;
        }
        else{
            System.out.println('\n'+"Would you like to change your orders toppings?");
            System.out.println("(1) Yes (0) No");
            int customize=input.nextInt();

            if(customize==1){
                int numToppings=0;

                if(order==1){
                    numToppings=4;
                } else if(order==2){
                    numToppings=6;
                } else if(order==3){
                    numToppings=2;
                }
                toppings(numToppings);
            }
            System.out.println("Total Cost of burger: "+calcDefaultPrice(order));
        }




    }


    //Calculate the price of all default burgers
    //This can be called upon to display the price of the selectedBurger (int value corresponding to type of burger) at any time
    public double calcDefaultPrice(int selectedBurger) {
        switch (selectedBurger) {
            //Classic Burger
            case 1:
                return 5.00;
            //Healthy Burger
            case 2:
                return 8.25;
            //Deluxe Burger
            case 3:
                return 8.00;

            //Error handling
            default:
                System.out.println("Error: Incorrect calcDefaultPrice input");
                return 0.00;

        }
    }


    //Calculate totalPrice of burger, return as double
    public double calcPrice(int inputBread, int inputMeat, int inputToppings, int inputChipsDrink){
        double totalPrice=0;
        totalPrice+=bread(inputBread);
        totalPrice+=meat(inputMeat);
        totalPrice+=toppings(inputToppings);
        totalPrice+=chipsDrink(inputChipsDrink);
        return totalPrice;
    }


    //Calculate AND customize toppings
    public double toppings(int numToppings){
        System.out.println('\n'+"------------------------------");
        System.out.println("           Toppings     ");
        System.out.println("------------------------------"+'\n');
        double priceTopping=0;


        for(int i=0;i<numToppings;i++){
            System.out.println("Please select from up to "+(numToppings-i)+" of the following toppings."+'\n');

            System.out.println("(1) Lettuce........ 0.25");
            System.out.println("(2) Tomato......... 0.25");
            System.out.println("(3) Pickle......... 0.25");
            System.out.println("(4) Onion.......... 0.25");
            System.out.println("(5) Avocado........ 1.00");
            System.out.println("(6) Mushroom....... 1.00");
            System.out.println("(7) L,T,P,O........ 1.00");
            System.out.println("(8) All............ 3.00");
            System.out.println('\n'+"(0) Complete selection.");
            int selectTopping=input.nextInt();

            if (selectTopping==0){
                return selectTopping;
            }
            else {
                switch (selectTopping) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        priceTopping += 0.25;
                        break;
                    case 5:
                    case 6:
                    case 7:
                        priceTopping += 1.00;
                        if (selectTopping ==7){
                            i+=4;
                        }
                        break;
                    case 8:
                        priceTopping += 3.00;
                        i+=6;
                        break;
                    default:
                        System.out.println("Error:Incorrect ");
                }
            }

        }
        return priceTopping;

    }

    //Calculates meat price
    public double meat(int theMeatType){
        switch (theMeatType){
            case 1:
                return 3.00;
            case 2:
                return 4.00;
            default:
                System.out.println("Error:Incorrect meat");
                return 0.00;

        }
    }

    //Calculates bread price
    public double bread(int typeBread){
        switch (typeBread){
            case 1:
                return 1.00;
            case 2:
                return 1.25;
            default:
                System.out.println("Error:Incorrect bread");
                return 0.00;

        }
    }

    //Calculates chipsDrink price
    public double chipsDrink(int ChipsorDrink){
        switch (ChipsorDrink){
            case 0:
                return 0;
            case 1:
                return 3.00;

            default:
                System.out.println("Error:Incorrect meat");
                return 0.00;

        }
    }
}

class HealthyBurger extends Hamburger{
    public HealthyBurger (int breadType, int meatType, double price){
        super(breadType,meatType,price);
    }

    @Override
    public double calcDefaultPrice(int selectedBurger) {
        return 8.25;
    }
}

