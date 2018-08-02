// Create a class and demonstate proper encapsulation techniques

// the class will be called Printer

// It will simulate a real Computer Printer

// It should have fields for the toner Level, number of pages printed, and

// also whether its a duplex printer (capable of printing on both sides of the paper).

// Add methods to fill up the toner (up to a maximum of 100%), another method to

// simulate printing a page (which should increase the number of pages printed).

import java.util.Scanner;

// Decide on the scope, whether to use constructors, and anything else you think is needed.
public class Printer {
    private int tonerLevel=100;
    private int pagesPrinted=0;
    private boolean duplex;
    Scanner input = new Scanner(System.in);

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        //Do not allow toner level below 0 or above 100
        if (tonerLevel <0 || tonerLevel >100){
            this.tonerLevel = 100;
        }
        //Do not allow pagesPrinted to be below 0 (you can't have a negative amount of pages printed)
        if (pagesPrinted !=0) {
            this.pagesPrinted = 0;
        }
        //No reason to error check duplex as it can only be either true or false
        this.duplex = duplex;
    }


    /*
        Handle display of printer
     */

    public void currentPageTonerDuplex(){
        System.out.println('\n'+"===============================");
        System.out.println("Toner Level: "+tonerLevel+"%");
        System.out.println("Pages printed: "+pagesPrinted);
        System.out.println("Duplex: "+duplex);
        System.out.println("==============================="+'\n');
    }

    public void mainPrinter(){
        for (int i =1;i!=0;i++) {
            currentPageTonerDuplex();
            System.out.println("Please enter a command to begin printing");
            System.out.println("'1' - to print  '2' - fill toner  '0' - exit printer");
            int command = input.nextInt();
            if (command == 1){
                print();
            }
            else if (command == 2){
                promptFillToner();
            }
            else if (command ==0){
                break;
            }
            else {
                System.out.println("Error: Incorrect command."+'\n');
            }
            input.nextLine(); //handle enter key
        }
    }


    /*
        Handle the toner level
     */

    public void promptFillToner(){
        if(tonerLevel >= 50 && tonerLevel<=100){
            System.out.println("Toner level is "+tonerLevel+"% and does not need to be filled."+'\n');
        }
        else if (tonerLevel >0 && tonerLevel <50){
            System.out.println("Toner level is "+tonerLevel+"% and should be filled.");
            System.out.println("Would you like to fill the toner now? Y or N");
            String increaseToner = input.nextLine();
            if(increaseToner=="Y" || increaseToner=="y"){
                fillToner();
            }
            else if(increaseToner=="N" || increaseToner=="n"){
            }
            else {
                System.out.println("Error: Input must be either 'Y' or 'N' (is NOT case sensitive)."+'\n');
            }
        }
        else if (tonerLevel==0) {
            System.out.println("Toner level is "+tonerLevel+"% and must be filled."+'\n');
            fillToner();
        }
    }

    public void fillToner(){
        this.tonerLevel=100;
        System.out.println("Toner level has been filled to 100%."+'\n');
    }

    public void updateToner(int pagesToPrint){
        tonerLevel-=pagesToPrint;
    }


    /*
        Handle printing/pageCount
     */

    public void print(){
        System.out.println("How many pages would you like to print?");
        int numPrint = input.nextInt();

        if (numPrint<tonerLevel){
            pageCount(numPrint);
            updateToner(numPrint);
        }
        else if (tonerLevel < numPrint && numPrint <= 100){
            System.out.println("Error: Not enough toner to print the pages"+'\n');
            promptFillToner();
        }
        else{
            System.out.println("Error: Input pages must be >0"+'\n');
        }
    }

    public void pageCount(int pagesToPrint){
        System.out.println("Total Pages Printed: "+(pagesPrinted+=pagesToPrint)+'\n');
    }


}
